package created;

/**
 * Created by dry on 28-Jul-15.
 */
public class Euclid {

    /**
     * Compute the greatest common divisor of
     * two nonnegative integers p and q as follows:
     * If q is 0, the answer is p. If not, divide p by q
     * and take the remainder r. The answer is the
     * greatest common divisor of q and r.
     *
     * @param p
     * @param q
     * @return
     */
    public static int greatestCommonDivisor(int p, int q) {
        if (q == 0) {
            return p;
        }

        int reminder = p % q;
        return greatestCommonDivisor(q, reminder);
    }


    public static int greatestCommonDivisorWithPrint(int p, int q) {
        if (q == 0) {
            return p;
        }

        int reminder = p % q;
        System.out.printf("[%s] [%s]=[%s]\n", p, q, reminder);
        return greatestCommonDivisorWithPrint(q, reminder);
    }

}
