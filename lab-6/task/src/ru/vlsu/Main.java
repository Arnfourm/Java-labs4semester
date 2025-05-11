package ru.vlsu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import ru.vlsu.ispi.Buffer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bufferLength = 20;
        int pocketLength = 5;

        Buffer buffer = new Buffer(bufferLength, pocketLength);

        Thread reader = new Thread(() -> {
           System.out.println("Введите текст: ");
           try{
               while (true){
                   String inputString = sc.nextLine();
                   for (int i = 0; i < inputString.length(); i++){
                       buffer.put(inputString.charAt(i));
                   }
                   buffer.put('\n');
               }
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
        });

        Thread writer = new Thread(() -> {
           try(FileWriter fileWriter = new FileWriter("Output.txt", true)){
               while (true){
                   char[] stringToWrite = buffer.take();
                   fileWriter.write(new String(stringToWrite));
                   fileWriter.flush();
               }
           } catch (IOException | InterruptedException e) {
               throw new RuntimeException(e);
           }
        });

        reader.start();
        writer.start();
    }
}

