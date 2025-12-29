import java.lang.System;
import java.util.Scanner;

class factorialOfANumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        for(int i=numb;i>=1;i--){
           System.out.println("Factorial of number "+i);
        }  
    }
}