package game;

/**
 * @author Ix Manuel (ixmanuel@yahoo.com)
 */
public final class PlayerFailures implements Failures {
        private final Integer current;

        public PlayerFailures() {
                this(0);
        }

        public PlayerFailures(final Integer current) {
                this.current = current;
        }

        public Failures with(final Integer current) {
                return new Failures(current);
        }       

        public Integer current() {
                return current;
        }
}