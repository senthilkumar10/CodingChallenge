/*
A simple programming challenge,
1. I have given an array, i want to rotate array left or right to n positions.
e.g:
int []array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
leftRotateArray(array,3) and output should be {4, 5, 6, 7, 8, 9, 10,1,2,3}
rightRotateArray(array,3) and output should be { 8, 9, 10,1,2,3,4, 5, 6, 7}
 */

package CodingChallenge;

import java.util.*;
import java.util.stream.IntStream;

public class RotateArray {

    public static void main(String[] args) {

        int n=3;
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        leftRotateArray(inputArray,n);
        leftRotateArrayWithForLoop(inputArray,n);
        rightRotateArray(inputArray,n);


    }

    public static void leftRotateArray(int[] arr,int n){
        IntStream.range(n,arr.length).mapToObj(i->arr[i] + " ").forEach(System.out::print);
        IntStream.range(0,n).mapToObj(i->arr[i] + " ").forEach(System.out::print);
        System.out.println();
    }

    public static void rightRotateArray(int[] arr,int n){
        IntStream.range(arr.length-n,arr.length).mapToObj(i->arr[i] + " ").forEach(System.out::print);
        IntStream.range(0,arr.length-n).mapToObj(i->arr[i] + " ").forEach(System.out::print);
    }


    public static void leftRotateArrayWithForLoop(int[] arr,int n){
        int mod = n%arr.length;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[(i+mod)%arr.length] + " ");
        }
        System.out.println();
    }





}
