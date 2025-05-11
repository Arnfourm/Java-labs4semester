package ru.vlsu.ispi;

import org.junit.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {
    QuickSort quickSort = new QuickSort();

    @Test
    public void SimpleTest(){
        int[] arrToTest = {1, 5, 2};
        int[] expectingArr = {1, 2, 5};

        assertArrayEquals(expectingArr, quickSort.sort(arrToTest, 0, arrToTest.length - 1));
    }

    @Test
    public void ReverseTest(){
        int arrLength = 100;

        int[] arrToTest = new int[arrLength];
        int[] expectingArr = new int[arrLength];
        for (int i = 0; i < arrLength; i++){
            arrToTest[i] = 99 - i;
            expectingArr[i] = i;
        }
        assertArrayEquals(expectingArr, quickSort.sort(arrToTest, 0, arrToTest.length - 1));
    }

    @Test
    public void RandomTest(){
        int arrLength = 100;

        int[] arrToTest = new int[arrLength];
        int[] expectingArr = new int [arrLength];

        for (int i = 0; i < arrLength; i++){
            arrToTest[i] = (int) (Math.random() * 100);
            expectingArr[i] = arrToTest[i];
        }

        Arrays.sort(expectingArr);
        assertArrayEquals(expectingArr, quickSort.sort(arrToTest, 0, arrToTest.length - 1));
    }

    private int[] generate(int length){
        int[] arrToGenerate = new int[length];
        for (int i = 0; i < length; i++){
            arrToGenerate[i] = (int) (Math.random() * 100);
        }
        return arrToGenerate;
    }

    private void check(int[] arrToTest){
        for (int i = 0; i < arrToTest.length - 1; i++){
            assertTrue(arrToTest[i] <= arrToTest[i + 1]);
        }
    }

    @Test
    public void StressTestOne(){
        int[] arrToTest = generate(10000);
        check(quickSort.sort(arrToTest, 0, arrToTest.length - 1));
    }

    @Test
    public void StressTestSecond(){
        int[] arrToTest = generate(100000);
        check(quickSort.sort(arrToTest, 0, arrToTest.length - 1));
    }

    @Test
    public void StressTestThird(){
        int[] arrToTest = generate(1000000);
        check(quickSort.sort(arrToTest, 0, arrToTest.length - 1));
    }

    @Test
    public void AverageTimeTest(){
        int testsCount = 10000;
        long[] timeList = new long[testsCount];

        for (int i = 0; i < testsCount; i++){
            long startTime = System.currentTimeMillis();

            int[] arrToTest = generate(100000);
            quickSort.sort(arrToTest, 0, arrToTest.length - 1);

            long endTime = System.currentTimeMillis();

            timeList[i] = endTime - startTime;
        }

        long totalTime = 0;
        for (long time : timeList){
            totalTime += time;
        }

        double averageTime = (double) totalTime / testsCount;
        System.out.println("Среднее время выполнения: " + averageTime + " миллисекунд");
    }
}