package CodingChallenge;


import java.util.ArrayList;
import java.util.List;

public class NumberCheck {

    /* Create a function which check a number for three different properties.

    Is the number prime?
    Is the number even?
    Is the number a multiple of 10?

    Each should return either true or false, which should be given as an array

    */



    public static void main(String args[]){

        int checkNbr = 8;

         List<String> results = new ArrayList<String>();
         StringBuffer sb = new StringBuffer();

        for(int i=1;i<checkNbr;i++){
            sb.append(isEven(checkNbr)).append(",").append(isPrime(checkNbr)).append(",").append(isMulipleOfTen(checkNbr)).append("\n");
            results.add(sb.toString());
        }

        System.out.println(results);
    }



    private static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }




    private static boolean isEven(int nbr){
        if(nbr>1){
            return (nbr%2==0)?true :false;
        }
        return false;
    }

    private static boolean isMulipleOfTen(int nbr){
        if(nbr>1){
            return (nbr%10==0)?true   :false;
        }
        return false;
    }


}
