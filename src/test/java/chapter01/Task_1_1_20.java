package chapter01;

import junit.framework.Assert;
import org.junit.Test;

public class Task_1_1_20 {

    public double logBase10FromFactorial(double number) {
        return Math.log10(factorial(number));
    }

    public double factorial(double number) {
        if (number == 0) {
            return 0;
        }

        if (number == 1L) {
            return 1L;
        } else return number * factorial(number - 1);
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals(0.0, factorial(0));
        Assert.assertEquals(1.0, factorial(1));
        Assert.assertEquals(2.0, factorial(2));
        Assert.assertEquals(6.0, factorial(3));
        Assert.assertEquals(24.0, factorial(4));
        Assert.assertEquals(120.0, factorial(5));
    }


}
