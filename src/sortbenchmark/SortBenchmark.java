package sortbenchmark;

import java.util.Arrays;

public class SortBenchmark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        int[] testData = GenerateData.genRandArray(n);
        int[] Bubble = testData.clone();
        Algorithm.bubbleSort(Bubble);

        System.out.println("Origin Arr :"+Arrays.toString(testData));
        System.out.println("Bubble Arr :"+Arrays.toString(Bubble));
    }
    
}
