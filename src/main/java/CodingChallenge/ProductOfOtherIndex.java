package CodingChallenge;

/*
Given an array of integers, return a new array such that each element at index i of the new array is the product of
all the numbers in the original array except the one at i.

For example if our inputs was [1.2,3,4,5], the expected output would be [120,60,40,30,24]
 */

public class ProductOfOtherIndex {

    public static void main(String[] args) {

        int[] nbrs = {1,2,3,4,5};
        int counter=0;
        int temp;

       for(int i=0;i<nbrs.length;i++){
           if(counter<=nbrs.length) {
               System.out.println(nbrs[i] + " " + nbrs[counter]);
           }
       }


    }
}
