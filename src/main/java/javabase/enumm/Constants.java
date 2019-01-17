package javabase.enumm;

/**
 * Created by Rt on 2018/10/23.
 */
public class Constants {

    public enum Plan {
        MARK_OPEN(1),
        MARK_NOMAL(2),
        MARK_NOMALkk(3),
        MARK_CLOSE(4),
        MARK_NOMAyyL(1);
        private final int value;

        public int getValue() {
            return value;
        }

        Plan(int value) {
            this.value = value;

        }

        public static Plan matchOpCode(int opCode) {
            for (Plan p : Plan.values()) {
                if (p.getValue() == opCode) {
                    return p;
                }
            }
            return null;
        }
    }

}
