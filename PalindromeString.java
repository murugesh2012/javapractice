import java.util.Scanner;

public class PalindromeString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String original,longestPalindrome="";
        System.out.println("Enter the original sentence");
        original=sc.nextLine();
        String[] words=original.split("[ .]+");
        for(String word : words)
        {
            if(isPalindrome(word)&& word.length()>longestPalindrome.length())
            {
                longestPalindrome=word;
                System.out.println("The Longest polinrome word: "+longestPalindrome);
            }
        }
    }
    public static boolean isPalindrome(String word)
    {
        String cleanedString=word.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder stringBuilder=new StringBuilder(cleanedString).reverse();
        return cleanedString.equals(stringBuilder.toString());
    }
}