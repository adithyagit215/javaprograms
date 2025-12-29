import java.lang.System;
import java.util.Scanner;

class printAsciiChar {
    public static void main(String args[]){
        for(char c='A';c<='Z';c++){
            System.out.println("The Ascii Charecter of "+c+" is "+ (int) c);
        }
    }
}