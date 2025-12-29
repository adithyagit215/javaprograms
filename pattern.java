import java.lang.System;
import java.util.Scanner;

class pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        String symbol = "*";
        String varTwo = "";
        //Symbol - *+""
        //varTwo - *
        //Symbol - *+*
        //varTwo - **
        //Symbol - *+**
        //varTwo - ***
        for(int i=0;i<=inputNum;i++){
            System.out.println(symbol+varTwo);
            varTwo = symbol;
        }
    }
}