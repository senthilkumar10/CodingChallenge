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
        List<Integer> productofOtherIndexes = new ArrayList<Integer>();
        int temp=1;

        if(nbrs.length>1){

            for(int i=0;i<nbrs.length;i++){
                if(i==0){
                    for(int j=1;j<nbrs.length;j++){
                        temp= temp*nbrs[j];
                    }
                    productofOtherIndexes.add(temp);
                    temp=1;
                }else{
                    for(int k=0;k<i;k++){
                        temp= temp*nbrs[k];
                    }

                    for(int l=i+1;l<nbrs.length;l++){
                        temp= temp*nbrs[l];
                    }
                    productofOtherIndexes.add(temp);
                    temp=1;
                }
            }
            System.out.println(Arrays.toString(nbrs));
            System.out.println(productofOtherIndexes);
        }else{
            System.out.println("The array should contains more than two numbers to compute product");
        }



    }


}
