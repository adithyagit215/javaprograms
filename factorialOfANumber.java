import java.lang.System;
import java.util.Scanner;

class factorialOfANumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        int numb = sc.nextInt();
        for(int i=numb;i>=1;i--){
           System.out.println("Factorial of number "+i);
        }  
=======
        int inputNumber = sc.nextInt();
        int j=0;
        int k=1;
        //5*4*3*2*1
        //i=5;5>=1;j=5;k=1*5=5;i--
        //i=4;4>=1;j=4;k=5*4=20;i--
        //i=3;3>=1;j=3;k=20*3=60;i--
        //i=2;2>=1;j=2;k=60*2=120;i--
        //i=1;1>=1;j=1;k=120*1;i--
        //i=0;0>=1;//out of loop
        for(int i=inputNumber; i>=1; i--){
            System.out.println("Value of i ="+i);
            j=i;
            k=k*j;
        }
        System.out.println("Value of k ="+k);
>>>>>>> fe3c3ef19eb0fef8e8c9e30d6359f3d50a539110
    }
}