import java.util.ArrayList;
import java.util.Scanner;
public class CryptoDemo1{
   public static void main(String[]args){
      Scanner kb = new Scanner (System.in);
      
      Cipher c = new Cipher();
      boolean quit = false;
      
      System.out.print("Enter text: ");
      String text = kb.next();
      
      while(!quit){
         System.out.print("\nEnter C for Caesar cipher or V for Vigenere cipher: ");
         String pick = kb.next();
         while(pick != ("V") || pick !=("C")){
            System.out.println("Invalid entry.");
            System.out.print("\nEnter C for Caesar cipher or V for Vigenere cipher: ");
            pick = kb.next();
         }
         if(pick.equals("C")){
            System.out.print("Enter shift: ");
            int s = kb.nextInt();
            String textCaesar = c.CaesarCode(text, s);
            System.out.println(textCaesar);
            
            System.out.print("Would you like to put this text into Vigenere Code(Y or N): ");
            String vCode = kb.next();
            if (pick.equals("Y")){
               text = c.VigenereCode;
               System.out.println(text);
            }
            else
               quit = true;
               
         }
         else if(pick.equals("V")){
            String textVigenere = c.VigenereCode(text);
            System.out.println(textVigenere);
         }
      }
   }
}   
         
     