import java.lang.System;
import java.util.Scanner;

class printTableValues{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int tableNumber = sc.nextInt();

        for(int i=1;i<=9;i++){
            System.out.println(tableNumber*i);
        }
    }
}