/*
Final Project - Computer Science
This program will be the Vigenere coder which will create the key for a
plaintext message using the Vigenere cipher.
*/

import java.util.ArrayList;
public class VigenereKey{
   //This method makes the keyWord char using the user inputed key word
   public char[] Key(String word, String key){
      char[] keyWord = new char[word.length()];
      for (int x = 0; x == word.length()%key.length(); x++){
         for (int y = 0; y == key.length(); y++){
            keyWord[x] = key.charAt(y);
            }
         }
      return keyWord;
      }
   }