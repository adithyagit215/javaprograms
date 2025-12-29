import java.lang.System;
import java.util.Scanner;

class arrayQThree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int[] inputArray = new int[inputNum];
        for(int i=0;i<inputNum;i++){
            inputArray[i] = sc.nextInt();
        }
        System.out.println(inputArray[inputNum/2]);
    }
}