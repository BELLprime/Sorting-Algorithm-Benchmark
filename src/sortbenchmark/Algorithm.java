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
    public static void selectionSort(int[] A){
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
    //Insertion
    public static void insertionSort(int[] A){
        int n=A.length;
        for (int i=1;i<=n-1;i++){
            int key = A[i];//temp of Num for compare with j
            int j=i-1;
            while (j>=0 && A[j]>key) {
                A[j+1]=A[j];
                j--;
            }
            A[j+1] = key;
        }
    }
    //----------------Quick sort------------------
    public static void quickSort(int[] A) {
        if (A != null && A.length > 1) {
            quickSort(A, 0, A.length - 1);
        }
    }
    public static void quickSort(int[] A,int l,int r){
        if (l<r){
            int s = partition(A,l,r);
            quickSort(A, l, s - 1); // เรียงซีกซ้าย
            quickSort(A, s + 1, r);
        }
    }
    private static int partition(int A[],int l,int r){ //HoarePartition
        int pivot=A[l];
        int i=l; int j=r+1 ;
        do {
            do {
                i++;
            } while (i<r && A[i]<pivot);  //until (A[i] >= pivot);
            do {
                j--;
            } while (A[j] > pivot); //until (A[j] <= pivot);
            //temp swap
            int temp=A[i]; A[i]=A[j]; A[j]=temp;
        } while (i < j); //until while(i>=j);
        //recover swap
        int temp=A[i]; A[i]=A[j]; A[j]=temp;
        //swap l and j
        temp=A[l]; A[l]=A[j]; A[j]=temp;
        return j;//index spilt postion
    }
}
