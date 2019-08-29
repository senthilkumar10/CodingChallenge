package CodingChallenge;

/*
Given an array of integers, return a new array such that each element at index i of the new array is the product of
all the numbers in the original array except the one at i.

For example if our inputs was [1.2,3,4,5], the expected output would be [120,60,40,30,24]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfOtherIndex {

    public static void main(String[] args) {

        int[] nbrs = {4,6,9,2,3};
        int[] product = new int[nbrs.length];
        int temp=1;

        if(nbrs.length>1){
            for(int i=0;i<nbrs.length;i++){
                temp = temp*nbrs[i];
            }

            for(int j=0;j<nbrs.length;j++){
                product[j] = temp/nbrs[j];
            }

            System.out.println(Arrays.toString(product));
        }else{
            System.out.println("The array should contains more than two numbers to compute product");
        }
    }
}
