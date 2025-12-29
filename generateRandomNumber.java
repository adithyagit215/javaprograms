import java.lang.System;
import java.util.Random;

class generateRandomNumber{
    public static void main(String args[]){
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(10);
            System.out.println("The number is "+rndNumber);
        while(rndNumber == 5){
            System.out.println("The number is 5");
            break;
        }
    }
}