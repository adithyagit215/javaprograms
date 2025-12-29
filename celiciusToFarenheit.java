import java.lang.System;
import java.util.Scanner;

class celiciusToFareheit{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double celicius = s.nextDouble();
        double fareheit = (celicius * 1.8) + 32;

        System.out.print("Farenheit "+fareheit);
    }
}