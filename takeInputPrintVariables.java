import java.lang.System;
import java.util.Scanner;

class takeInputPrintVariables {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.print("Hello "+name+" you are "+age+" years old");
    }
}