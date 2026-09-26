package sortbenchmark;

import java.util.Arrays;

public class SortBenchmark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;

        GenerateData dataGen = new GenerateData(n);
        int[] bubbleData = dataGen.getCopy();
        int[] selectionData = dataGen.getCopy();
        int[] insertionData = dataGen.getCopy();
        int[] quickData = dataGen.getCopy();

        Algorithm.bubbleSort(bubbleData);
        Algorithm.selectionSort(selectionData);
        Algorithm.insertionSort(insertionData);
        Algorithm.quickSort(quickData);

        System.out.println("Origin Arr        : "+Arrays.toString(dataGen.getOriginal()));
        System.out.println("Bubble sort Arr   : "+Arrays.toString(bubbleData));
        System.out.println("Selection sort Arr: "+Arrays.toString(selectionData));
        System.out.println("Insertion sort Arr: "+Arrays.toString(insertionData));
        System.out.println("Quick sort Arr    : "+Arrays.toString(quickData));
    }
    
}
