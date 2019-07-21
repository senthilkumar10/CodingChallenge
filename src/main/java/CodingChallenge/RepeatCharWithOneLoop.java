package CodingChallenge;

public class RepeatCharWithOneLoop {

    public static void main(String[] args) {

        String rep = "A";
        int times = 4;

        for (int j = 0; j <= times; j++) {

            System.out.println(new String(new char[j]).replace("\0", rep));


        }
    }
}
