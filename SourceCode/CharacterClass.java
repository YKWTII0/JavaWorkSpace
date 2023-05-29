import java.util.Scanner;

public class CharacterClass {
    String userInput = "";
    String newString = "";
    int numberSum = 0;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("User input: ");
        String userInput = input.nextLine();
        input.close();

        CharacterClass choi = new CharacterClass();
        choi.isAlphabetic();
        choi.getNumericValue();
        choi.isDigit();
    }

    public void isAlphabetic(){
        for (int i = 0; i < userInput.length(); i++){
            char a = userInput.charAt(i);
            newString += a;
        }
        System.out.println("String: " + newString);
    }

    public void getNumericValue(){

    }

    public void isDigit(){
        // 사용자 입력 중 정수 숫자를 더해서 그 합
    }
}
