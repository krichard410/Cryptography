/*Final Project - Computer Science
This program will be the Caesar coder which will code/translate the
plaintext message using the caesar cipher.
*/

import java.util.ArrayList;
public class CaesarCoder{
   
   ArrayList<String> alphabet = new ArrayList<String>();
   //Here is the Coder method which will take the plaintext and translate it into Caesar 
   public CaesarCoder(){}
   
   public String CaesarCoder(String plaintext, int shift){
      alphabet.add(0,"a");
      alphabet.add(1,"b");
      alphabet.add(2,"c");
      alphabet.add(3,"d");
      alphabet.add(4,"e");
      alphabet.add(5,"f");
      alphabet.add(6,"g");
      alphabet.add(7,"h");
      alphabet.add(8,"i");
      alphabet.add(9,"j");
      alphabet.add(10,"k");
      alphabet.add(11,"l");
      alphabet.add(12,"m");
      alphabet.add(13,"n");
      alphabet.add(14,"o");
      alphabet.add(15,"p");
      alphabet.add(16,"q");
      alphabet.add(17,"r");
      alphabet.add(18,"s");
      alphabet.add(19,"t");
      alphabet.add(20,"u");
      alphabet.add(21,"v");
      alphabet.add(22,"w");
      alphabet.add(23,"x");
      alphabet.add(24,"y");
      alphabet.add(25,"z");
      plaintext = plaintext.toLowerCase();
      String caesarMessage = "";
      for (int i = 0; i < plaintext.length(); i++){
         int position = alphabet.indexOf(i);
         int cipher = alphabet.indexOf(shift);
         caesarMessage += cipher;
      }
      return caesarMessage;
   }
} 