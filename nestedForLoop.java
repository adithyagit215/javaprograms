import java.lang.System;

class nestedForLoop {
    public static void main(String args[]){
        for(int i=1;i<=3;i++){
            //1<=3
            //1<=1
            //*
            //2<=1 //breaks
            //2<=3
            //1<=2
            //*
            //2<=2

            for(int j=1;j<=i;j++){
                
                System.out.println(j*"1");
            }
        }
    }
}