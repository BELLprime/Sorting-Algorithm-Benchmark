package sortbenchmark;
public class Algorithm {
    //Bubble sort
    public static void bubbleSort(int[] A){
        int n=A.length;
        for (int i=0;i<=n-2;i++) {
            for (int j=0;j<=n-2-i;j++) {
                if (A[j+1] < A[j]) {
                    int temp=A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }
}
