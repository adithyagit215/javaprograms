import java.lang.System;
import java.util.Scanner;

class sumOfNNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        int inpNumber = sc.nextInt();
        int j = 0;
        for(int i=1;i<=inpNumber;i++){
            //i=1 ---> 1
            //i=2 ---> 1+2
            //i=3 ---> 3+3
            //i=4 ---> 6+4
            //i=5 ---> 10+5

            j=j+i;
        }
        System.out.print("The Sum of N natural numbers is "+j);
=======
        int input = sc.nextInt();
        int loopVariable=0;
        for(int i=1;i<=input;i++){
            loopVariable = loopVariable+i;
        }
        System.out.println("Loop "+loopVariable);
>>>>>>> fe3c3ef19eb0fef8e8c9e30d6359f3d50a539110
    }
}