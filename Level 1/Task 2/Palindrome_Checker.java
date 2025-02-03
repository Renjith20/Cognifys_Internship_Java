import java.util.*;
public class Palindrome_Checker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or Phrase : ");
        String text = sc.nextLine();
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = true;
        int length = cleanText.length();

        for(int i=0 ; i<length / 2 ; i++){
            if(cleanText.charAt(i) != cleanText.charAt(length - 1 - i) ){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.print(text + " is Palindrome ..");
        }else{
            System.out.print(text + " is not a Palindrome ..");
        }
    }
}
