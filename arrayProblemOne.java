import java.lang.System;
import java.util.Scanner;

class arrayProblemOne{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        int[] sumArray = {num1, num2, num3, num4, num5};
        System.out.println(sumArray);

    }
}