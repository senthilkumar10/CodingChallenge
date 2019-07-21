package CodingChallenge;


import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacters {

    //Input = aaaabbbccdee Output = a4b3c2de2

    public static void main(String[] args) {

        String input = "aaaabbbccdee";

        char[] ch =  input.toLowerCase().toCharArray();

        Map<Character,Integer> countCharc = new LinkedHashMap<Character, Integer>();
            for (char letter :ch) {
                if(countCharc.containsKey(letter)==false){
                    countCharc.put(letter,1);
                }else{
                    Integer n = countCharc.get(letter);
                    countCharc.put(letter,n+1);
                }
            }

            System.out.println(countCharc);




    }


}
