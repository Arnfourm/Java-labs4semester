package ru.vlsu.ispi;

public class QuickSort {
    public int[] sort(int[] arrToSort, int low, int high){
        if (arrToSort.length == 0 || low >= high){
            return arrToSort;
        }

        int middle = low + (high - low) / 2;
        int border = arrToSort[middle];

        int i = low, j = high;
        while (i <= j){
            while (arrToSort[i] < border){
                i++;
            }
            while (arrToSort[j] > border){
                j--;
            }
            if (i <= j){
                int swap = arrToSort[i];
                arrToSort[i] = arrToSort[j];
                arrToSort[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j){
            sort(arrToSort, low, j);
        }
        if (high > i){
            sort(arrToSort, i, high);
        }

        return arrToSort;
    }
}
