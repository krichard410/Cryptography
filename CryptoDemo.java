import java.util.Scanner;
public class CryptoDemo{
   public static void main(String [] args){
      boolean end = false;
      while(!false){
         Scanner keyboard = new Scanner(System.in);
         int shift = 0;
         String plaintext = "", keyword = "";
         
         System.out.print("\nWould you like it translated into Caesar or Vigenere? Enter C or V: ");
         String cipherChoice = keyboard.nextLine();
         cipherChoice.toUpperCase();
         boolean test = true;
         while (!test){
            if (cipherChoice.equals("C")){
            test = false;
            }
            else if (cipherChoice.equals("V")){
            test = false;
            }
            else{
            System.out.print("\nError. Would you like it translated into Caesar or Vigenere? Enter C or V: ");
            cipherChoice = keyboard.nextLine();
            cipherChoice.toUpperCase();
            }
         }
               
         System.out.print("Enter a message: ");
         plaintext = keyboard.nextLine();
         
         System.out.print("Enter a shift: ");
         shift = keyboard.nextInt();
         
         System.out.print("Enter a keyword: ");
         keyword = keyboard.next();

         plaintext = plaintext.replaceAll("\\s+","");         
         Cipher c = new Cipher(plaintext, shift, keyword);
            
         if(cipherChoice.equals("C")){
            System.out.println("This is the message which has gone through the Caesar coder: \n" + c.CaesarCoder());
            System.out.print("\nWould you like to put your Caesar code message through the Vigenere coder too? Y/N: ");
            String answer = keyboard.next();
            if (answer.equals("Y")){
               Cipher c2 = new Cipher(c.CaesarCoder(), shift, keyword);
               System.out.println("This is the message which has gone through the Caesar and Vigenere coder: \n" + c2.VigenereCoder());
               System.out.println("The Vigenere key is: \n" + c2.VigenereKey());
               System.out.println("The message after being decoded is: \n" + plaintext);
            }
            else if (answer.equals("N"))
               System.out.println("The message after being decoded is: \n" + c.CaesarKey());
         }
         else if(cipherChoice.equals("V")){
            System.out.println("This is the message which has gone through the Vigenere coder: \n" + c.VigenereCoder());
            System.out.println("The Vigenere key is: \n" + c.VigenereKey());
            System.out.print("\nWould you like to put your Vigenere code message through the Caesar coder too? Y/N: ");
            String answer = keyboard.next();
            if (answer.equals("Y")){
               Cipher c2 = new Cipher(c.VigenereCoder(), shift, keyword);
               System.out.println("This is the message which has gone through the Vigenere and Caesar coder: \n" + c2.CaesarCoder());
               System.out.println("The message after being decoded is: \n" + plaintext);
            }
            else if (answer.equals("N"))
               System.out.println("The message after being decoded is: \n" + plaintext);
         }
      System.out.println("Would you like to play again? true/false: ");
      end = keyboard.nextBoolean();
      if (end == false)
         break;
      }
   }
}