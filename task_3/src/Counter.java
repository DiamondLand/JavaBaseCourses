package task_3.src;

public class Counter {
    private static int objectCount = 0;

    public Counter() {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }
}

