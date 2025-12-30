import java.lang.System;
import java.util.Scanner;

class vowel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String inputCharecter = sc.nextLine();
        if(inputCharecter == "a" || inputCharecter == "e" || inputCharecter == "i" || inputCharecter == "o" || inputCharecter == "u"){
            System.out.print("Vowel actor");
        }
        else{
            System.out.print("Not a Vowel actor");
        }
    }
}