package ru.vlsu.ispi;

public class Buffer {
    private final char[] workingString;
    private int putCurrentChar = 0;
    private int readCurrentChar = 0;
    private int count = 0;
    private final int m;

    public Buffer(int workingStringLength, int m){
        this.workingString = new char[workingStringLength];
        this.m = m;
    }

    public synchronized void put(char currentChar) throws InterruptedException {
        while (count == workingString.length){
            wait();
        }
        workingString[putCurrentChar] = currentChar;

        if (putCurrentChar == workingString.length - 1){
            putCurrentChar = 0;
        }
        else{
            putCurrentChar++;
        }

        count++;
        notifyAll();
    }

    public synchronized char[] take() throws InterruptedException{
        while (count < m) {
            wait();
        }

        char[] charsToReturn = new char[m];
        for (int i = 0; i < m; i++){
            charsToReturn[i] = workingString[readCurrentChar];

            if (readCurrentChar == workingString.length - 1){
                readCurrentChar = 0;
            }
            else{
                readCurrentChar++;
            }

            count--;
        }
        notifyAll();
        return charsToReturn;
    }
}
