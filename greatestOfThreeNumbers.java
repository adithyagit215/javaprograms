import java.lang.System;
import java.util.Scanner;

class greatestOfThreeNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.print("Number 1 is greater then Number 2 and 3");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.print("Number 1 is greater then Number 2 and 3");
        }
        else{
            System.out.print("Number 1 is greater then Number 2 and 3");
        }
    }
}