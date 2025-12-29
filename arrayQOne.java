import java.lang.System;
import java.util.Scanner;

class arrayQOne{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        //1 - 60
        //2 - 29
        //3 - 33
        //4 - 94
        //5 - 55
        for(int i=0;i<=4;i++){
            marks[i] = sc.nextInt();
        }
        for(int j=0;j<=4;j++){
        System.out.println(marks[j]);
        }
    }
}