package sortbenchmark;

import java.util.Arrays;

public class SortBenchmark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        int[] testData = GenerateData.genRandArray(n);
        
        System.out.println(Arrays.toString(testData));
    }
    
}
