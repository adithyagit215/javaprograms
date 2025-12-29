import java.lang.System;
import java.util.Scanner;

class sumOfNNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int loopVariable=0;
        for(int i=1;i<=input;i++){
            loopVariable = loopVariable+i;
        }
        System.out.println("Loop "+loopVariable);
    }
}