import java.lang.System;
import java.util.Scanner;

class simpleInterest{
    public static void main(String args[]){

        Scanner sn = new Scanner(System.in);
        int principle = sn.nextInt();
        int rate = sn.nextInt();
        int time = sn.nextInt();

        int simpleInterestValue = (principle * rate * time)/100;
        System.out.print("PNR = "+simpleInterestValue);
    }
}