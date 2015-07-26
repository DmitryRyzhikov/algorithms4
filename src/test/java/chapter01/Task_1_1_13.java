package chapter01;

import org.junit.Test;

public class Task_1_1_13 {

    @Test
    public void test_1_1_13() {

        int array[][] = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int rows = array.length;
        int columns = array[0].length;

        System.out.printf("Width [%s], height [%s]\n", rows, columns);

        int transposed[][] = new int[columns][rows];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int element = array[i][j];
                transposed[j][i] = element;
            }
            System.out.println();
        }

        printIntArray(array);

        System.out.println("----------------------------------");

        printIntArray(transposed);

    }

    private void printIntArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int element = array[i][j];
                System.out.print(element);
            }
            System.out.println();
        }

    }

}
