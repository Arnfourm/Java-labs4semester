package ru.vlsu.ispi;

public class CountingSort {
    private final int[] aux = new int[1001];

    public int[] sort(int[] arr){
        int[] result = new int[arr.length];
        int pos = 0;

        for (int i : arr){
            aux[i]++;
        }

        for (int i = 0; i <= 1000; i++){
            while (aux[i] > 0){
                result[pos] = i;
                pos++;
                aux[i]--;
            }
        }

        return result;
    }
}
