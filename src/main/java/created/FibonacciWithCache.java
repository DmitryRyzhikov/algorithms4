package created;

import java.util.HashMap;
import java.util.Map;

public class FibonacciWithCache {

    public static Map<Integer, Long> fibonacciSequence = new HashMap<Integer, Long>();

    public static long fibonacci(int sequenceIndex) {
        if(fibonacciSequence.containsKey(sequenceIndex)){
            return fibonacciSequence.get(sequenceIndex);
        }

        if (sequenceIndex == 0) {
            fibonacciSequence.put(sequenceIndex, 0L);

            return 0;
        }

        if (sequenceIndex == 1){
            fibonacciSequence.put(sequenceIndex, 1L);

            return 1;
        }

        long fibonacciNumber = fibonacci(sequenceIndex - 1) + fibonacci(sequenceIndex - 2);
        fibonacciSequence.put(sequenceIndex, fibonacciNumber);

        return fibonacciNumber;
    }

    public static void main(String[] args) {
        for (int index = 0; index < 100; index++)
            System.out.println(index + " " + fibonacci(index));
    }
}
