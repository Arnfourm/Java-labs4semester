package ru.vlsu.ispi;

import java.util.concurrent.ThreadLocalRandom;

public class Calculator {
    private static final int radius = 1;

    public static double calculator(long countPoints, int countThreads) throws InterruptedException {
        long pointsInTotal = 0;
        Thread[] threads = new Thread[countThreads];
        long[] singleThreadsResults = new long[countThreads];

        for (int i = 0; i < countThreads; i++) {
            final int threadIndex = i;
            threads[threadIndex] = new Thread(() -> {
                long pointsIn = 0;
                long threadStart = (countPoints / countThreads) * threadIndex;
                long threadEnd = (countPoints / countThreads) * (threadIndex + 1);

                for (long j = threadStart; j < threadEnd; j++) {
                    double x = ThreadLocalRandom.current().nextDouble(radius);
                    double y = ThreadLocalRandom.current().nextDouble(radius);
                    if (Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(radius, 2)) {
                        pointsIn++;
                    }
                }
                singleThreadsResults[threadIndex] = pointsIn;
            });
            threads[threadIndex].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        for (long singleResult : singleThreadsResults) {
            pointsInTotal += singleResult;
        }

        return (4.0 * pointsInTotal) / countPoints;
    }
}
