import java.lang.System;
import java.util.Scanner;

class patternOne{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int j = 1;
        //first loop execution

        //*
        //**
        //***
        //****
        for(int i=1;i<=inputNumber;i++){
            System.out.println("*");
            j++;
        }
    }
}