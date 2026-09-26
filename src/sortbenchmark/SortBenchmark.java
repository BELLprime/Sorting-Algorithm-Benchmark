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

        Algorithm.bubbleSort(bubbleData);
        Algorithm.Selection(selectionData);

        System.out.println("Origin Arr   : "+Arrays.toString(dataGen.getOriginal()));
        System.out.println("Bubble Arr   : "+Arrays.toString(bubbleData));
        System.out.println("Selection Arr: "+Arrays.toString(selectionData));
    }
    
}
