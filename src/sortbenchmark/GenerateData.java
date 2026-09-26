package sortbenchmark;

import java.util.Random;

public class GenerateData {
    public static int[] genRandArray(int n) {
        int [] data = new int[n];
        Random rand = new Random();

        for (int i=0;i<n;i++) { // 0...n-1
            data[i]=rand.nextInt(n);
        }
        return data;
    }
}
