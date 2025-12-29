import java.lang.System;

class nestedLoopPatternOne{
    public static void main(String args[]){
        /*
        for(int i=1;i<=3;i++){
            //1<=3
            //2<=3
            //3<=3
            //4<=3                                          //breaks
            for(int j=1;j<=3;j++){
                //1<=1
                //***                                       //printed
                //2<=1
                //break
                //1<=2
                //***                                       //printed
                //2<=2
                //***                                       //printed
                //3<=1
                //break
                //1<=3
                //***                                       //printed
                //2<=3
                //***                                       //printed
                //3<=3                                      
                //***                                       //printed
                System.out.println("***");
            }
        }
        */

       for(int i=1;i<=3;i++){
        System.out.println("***");
        for(int j=1;j<=3;j++){
            System.out.println(" ");
        }
       }
    }
}