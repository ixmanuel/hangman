package hangman;

import game.GuessedEvent;
import event.Dispatching;
import event.Event;
import event.IsUncaught;
import word.WereLettersOn;

/**
 * Dispatching events.
 *
 * @author Ix Manuel (ixmanuel@yahoo.com)
 */
public final class IfGuessed implements Dispatching {
        private final WereLettersOn wereLetters;
        private final Dispatching source;

        public IfGuessed(final WereLettersOn wereLetters, 
                final Dispatching source) {
                this.wereLetters = wereLetters;
                this.source = source;
        }

        @Override
        public Event event() {
                Event sourceEvent = source.event();     
                return                  
                new IsUncaught(sourceEvent).matched() && wereLetters.on()
                ? new GuessedEvent()    
                : sourceEvent
                ;               
        }
}