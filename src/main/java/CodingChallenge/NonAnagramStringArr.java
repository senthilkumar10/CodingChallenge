/*
Find non anagram strings of given array,
inputArray = {"tea", "ate", "apple", "eat", "are", "ear", "bce", "ade"}
outputArray = {"apple","bce","ade"}
 */


package CodingChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NonAnagramStringArr {

    public static void main(String[] args) {

        String[] inputStringArray  = {"tea", "ate", "apple", "eat", "are", "ear", "bce", "ade"};

        System.out.println("The Input String Array - "+ Arrays.toString(inputStringArray));
        System.out.print("The Non Anagram of String Array - ");nonAnagramArrString(inputStringArray);
    }


    private static String sortEachChar(String input){
        char[] temp = input.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public static void nonAnagramArrString(String[] arr){
        List<String> eachElementsSortedList = new ArrayList<String>();
        for(int i=0;i<arr.length;i++){
            eachElementsSortedList.add(sortEachChar(arr[i]));
        }

        for(int m=0;m<arr.length;m++){
            if(Collections.frequency(eachElementsSortedList,sortEachChar(arr[m]))==1) {
                System.out.print(arr[m] + " ");
            }
        }
        System.out.println();
    }


}
