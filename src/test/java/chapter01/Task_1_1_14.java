package chapter01;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Task_1_1_14 {

    public static Map<Integer, Integer> powersOfTwo = new HashMap<Integer, Integer>();

    @Test
    public void test() {
        Assert.assertEquals(8, logBaseTwo(8));
        Assert.assertEquals(16, logBaseTwo(10));
    }

    /**
     * Returns largest int not larger then base-2 logarithm of n
     *
     * Log base-2 from X = Y, when 2 power Y = X.
     * Example: method gets n=8.
     * log base-2 from 8 = Y.
     * Then 2 power 1 = 2 < 8 - not solution
     * Then 2 power 2 = 4 < 8 - not solution
     * Then 2 power 3 = 8 <= 8 - solution!
     */
    public static int logBaseTwo(int n) {
        boolean found = false;
        int power = 0;
        int value = 1;
        int previousValue = 0;


        while(!found){
            value = twoPower(power);
            if(value < n){
                power ++;
                continue;
            }else {
                found = true;
            }

            previousValue = value;
        }

        return previousValue;
    }

    private static int twoPower(int power) {
        Integer value = powersOfTwo.get(power);
        if(value != null){
            return value;
        }

        if (power == 0){
            powersOfTwo.put(power, 1);
            return 1;
        } else if (power == 1) {
            powersOfTwo.put(power, 2);
            return 2;
        } else {
            value =  2 * twoPower(power - 1);
            powersOfTwo.put(power, value);
            return value;
        }

    }

    @Test
    public void testPower(){
        Assert.assertEquals(1, twoPower(0));
        Assert.assertEquals(2, twoPower(1));
        Assert.assertEquals(8, twoPower(3));
        Assert.assertEquals(32, twoPower(5));
    }


}
