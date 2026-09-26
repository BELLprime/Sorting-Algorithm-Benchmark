package sortbenchmark;

public class TimeTracker {
    private long startTime;
    public void start() {
        this.startTime = System.nanoTime();
    }
    public double stop() {
        long endTime = System.nanoTime();
        return (endTime - this.startTime)/1_000_000.0; //ms
    }
}
