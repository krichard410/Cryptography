import java.util.ArrayList;
import java.util.Scanner;
public class Cipher{
   ArrayList<String> alphabet = new ArrayList<String>();

   public Cipher(){}
   
   
   public static void setAlphabet(ArrayList<String> alphabet){
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
   }
   
   public String CaesarCode(String text, int shift){
      int position = 0;
      for(int i=0; i<text.length(); i++){
         for(int j=0; j<alphabet.size(); j++){
            if(text.charAt(i).equals(alphabet.indexOf(j)))
               position = j;
         }
      }
   }
}