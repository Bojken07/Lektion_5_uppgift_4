package com.bojken.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       boolean isPlaying = true;
       int stop = 0;
       String str = Integer.toString(stop);
        System.out.println("Using Integer.toString : " + str);

        while(isPlaying == true){

            System.out.println("Terminate the program");
            stop = scan.nextInt();

            if(stop == 0){
                isPlaying = false;
            }
        }
        System.out.println("Program is terminated!");
    }
}
