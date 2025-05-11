package ru.vlsu.ispi;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class CountingSortTest {
    CountingSort countingSort = new CountingSort();

    @Test
    public void SimpleTest(){
        int[] arrToTest = {1, 5, 2};
        int[] expectingArr = {1, 2, 5};

        assertArrayEquals(expectingArr, countingSort.sort(arrToTest));
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
        assertArrayEquals(expectingArr, countingSort.sort(arrToTest));
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
        assertArrayEquals(expectingArr, countingSort.sort(arrToTest));
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
        check(countingSort.sort(generate(1000)));
    }

    @Test
    public void StressTestSecond(){
        check(countingSort.sort(generate(10000)));
    }

    @Test
    public void StressTestThird(){
        check(countingSort.sort(generate(1000000)));
    }
}