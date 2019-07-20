package CodingChallenge;

import java.sql.SQLOutput;

public class NumberCheck {

    /* Create a function which check a number for three different properties.

    Is the number prime?
    Is the number even?
    Is the number a multiple of 10?

    Each should return either true or false, which should be given as an array

    */



    public static void main(String args[]){

    numberCheck(5);

    }


    private static void numberCheck(int nbr){
        if(nbr>1){
            for(int i=1;i<=nbr;i++){
                System.out.println(i);
            }
        }
    }


}
