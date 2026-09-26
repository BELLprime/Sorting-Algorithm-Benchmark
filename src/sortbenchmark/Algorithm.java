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
    //Selection
    public static void Selection(int[] A){
        int n=A.length;
        for (int i=0;i<=n-2;i++){
            int min=i;//index of min (head)
            for (int j=i+1;j<=n-1;j++){
                if (A[j] < A[min])
                    min=j;
            }
            int temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
    }
}
