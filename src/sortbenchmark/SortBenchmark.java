package sortbenchmark;

public class SortBenchmark {
    private static final int[] SIZES = {500, 1_000, 10_000, 50_000, 100_000};
    
    public static void main(String[] args) {
        TimeTracker timer = new TimeTracker();

        System.out.println("========================================================================================");
        System.out.printf("| %-10s | %-15s | %-16s | %-16s | %-14s |\n", "n", "Bubble (ms)", "Selection (ms)", "Insertion (ms)", "Quick (ms)");
        System.out.println("----------------------------------------------------------------------------------------");

        for (int n : SIZES) {
            GenerateData dataGen = new GenerateData(n);

            //Bubble Sort
            int[] bubbleData = dataGen.getCopy();
            timer.start();
            Algorithm.bubbleSort(bubbleData);
            double timeBubble = timer.stop();

            //Selection Sort
            int[] selectionData = dataGen.getCopy();
            timer.start();
            Algorithm.selectionSort(selectionData);
            double timeSelection = timer.stop();

            //Insertion Sort
            int[] insertionData = dataGen.getCopy();
            timer.start();
            Algorithm.insertionSort(insertionData);
            double timeInsertion = timer.stop();

            //Quick Sort
            int[] quickData = dataGen.getCopy();
            timer.start();
            Algorithm.quickSort(quickData);
            double timeQuick = timer.stop();

            System.out.printf("| %-10d | %-15.3f | %-16.3f | %-16.3f | %-14.3f |\n", n, timeBubble, timeSelection, timeInsertion, timeQuick);
        }
        System.out.println("========================================================================================");
    }
}
