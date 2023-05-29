import java.util.Scanner;
import java.util.Random;
import java.util.StringTokenizer;

public class DiceGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("User input: ");
        String inputString = input.next();
        input.close();

        StringTokenizer st = new StringTokenizer(inputString, "&");
        int[] userNums = new int[st.countTokens()];
        int i = 0;
        while (st.hasMoreTokens()) {
            userNums[i++] = Integer.parseInt(st.nextToken());
        }

        int computerNum = rand.nextInt(6) + 1;

        int maxUserNum = userNums[0];
        for (i = 1; i < userNums.length; i++) {
            if (userNums[i] > maxUserNum) {
                maxUserNum = userNums[i];
            }
        }

        if (maxUserNum > computerNum) {
            System.out.println("User: " + maxUserNum);
            System.out.println("Computer: " + computerNum);
            System.out.println("User win!");
        } else if (maxUserNum < computerNum) {
            System.out.println("User: " + maxUserNum);
            System.out.println("Computer: " + computerNum);
            System.out.println("Computer win!");
        } else {
            System.out.println("User: " + maxUserNum);
            System.out.println("Computer: " + computerNum);
            System.out.println("Draw");
        }
    }
}
