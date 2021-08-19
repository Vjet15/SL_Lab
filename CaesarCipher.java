package Ex_1;
import java.util.*;

public class CaesarCipher
{
    // Encrypts text using a shift od s
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();
        System.out.print("Enter Key: ");
        int s = sc.nextInt();

        System.out.println("Key : " + s);
        System.out.println("Encryption: " + encrypt(text, s));
        System.out.println("Decryption  : " + text);
    }
}