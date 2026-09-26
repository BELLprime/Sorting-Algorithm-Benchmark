package sortbenchmark;

import java.util.Random;

public class GenerateData {
    private int[] originData;

    public GenerateData(int n) { //construct
        this.originData = new int[n];
        Random rand = new Random();
        for (int i=0;i<n;i++) {
            this.originData[i] = rand.nextInt(n); // 0...n-1
        }
    }
    //get
    public int[] getCopy() {
        return this.originData.clone();
    }
    public int[] getOriginal() {
        return this.originData;
    }
}
