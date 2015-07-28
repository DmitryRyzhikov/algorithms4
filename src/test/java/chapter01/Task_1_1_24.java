package chapter01;

import created.Euclid;
import junit.framework.Assert;
import org.junit.Test;

public class Task_1_1_24 {

    @Test
    public void test() {
        int commonDivisor = Euclid.greatestCommonDivisor(105, 24);
        System.out.println(commonDivisor);
    }

    @Test
    public void testTwo() {
        int commonDivisor = Euclid.greatestCommonDivisorWithPrint(1234567, 1111111);
        System.out.println(commonDivisor);
    }


}
