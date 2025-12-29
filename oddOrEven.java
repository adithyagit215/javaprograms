import java.lang.System;
import java.util.Scanner;

class oddOrEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        if(inputNumber % 2 == 0){
            System.out.print("Number is even");
        }
        else{
            System.out.print("Number is odd");
        }
    }
}