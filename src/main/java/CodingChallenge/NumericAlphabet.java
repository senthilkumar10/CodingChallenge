package CodingChallenge;

public class NumericAlphabet {


    public static void main(String[] args) {

        int inputNumber = 100;

        //Approach 1

        if(inputNumber>0){

            if(inputNumber<=26){

                System.out.println(sendAlphabet(inputNumber));

            }else{
                StringBuilder finalAlphabets = new StringBuilder();
                int numberOfAlphabets = inputNumber/26;

                for(int i=0;i<numberOfAlphabets;i++){
                    finalAlphabets.append("Z");
                }

                int remainingDigits = inputNumber-(26*numberOfAlphabets);

                finalAlphabets.append(sendAlphabet(remainingDigits));

                System.out.println(finalAlphabets);


            }

        }else{
            System.out.println("The input number be should greater than 0");
        }


        //Approach 2


        int que = inputNumber/26;
        int rem = inputNumber%26;

        System.out.println(que);
        System.out.println(rem);
        StringBuilder stringBuilder = new StringBuilder();

        if (que > 0) {
            for(int i=0;i<que;i++){
                stringBuilder.append('z');
            }
        }

        if (rem > 0) {
            stringBuilder.append((char)(97+rem-1));
        }

        System.out.println(stringBuilder);

    }



    private static String sendAlphabet(int number){
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G","H","I","J","K","L","M","N","O",
                "P","Q","R","S","T","U","V","W","X","Y","Z"};

        return alphabet[number-1];
    }



}
