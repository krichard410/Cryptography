public class Cipher{
   String plaintext;
   int shift;
   String codeword;
   
   public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
   public static final String alphabet2 = "zyxwvutsrqponmlkjihgfedcba";
   
   public Cipher(String plaintext, int shift, String codeword){
      this.plaintext = plaintext;
      this.shift = shift;
      this.codeword = codeword;
   }
   
   //Here are the setters for this class
   public void setShift(int shift){
      this.shift = shift;
   }
   
   public void setPlaintext(String plaintext){
      this.plaintext = plaintext;
   }
   
   public void setCodeword(String codeword){
      this.codeword = codeword;
   }
   
   //Here are the getters for this class
   public int getShift(){
      return this.shift;
   }
   
   public String getPlaintext(){
      return this.plaintext;
   }

   public String getCodeword(){
      return this.codeword;
   }

   //Here is the encrypt method which takes the plain message and codes it to caesar cipher   
    public String CaesarCoder(){
        plaintext = plaintext.toLowerCase();
        String cipher = ""; 
        for (int i = 0; i < plaintext.length(); i++){
            int position = alphabet.indexOf(plaintext.charAt(i));
            int keyVal = (shift + position) % 26;
            char replaceVal = alphabet.charAt(keyVal);
            cipher += replaceVal;
        }
        return cipher;
    }
    
    public String CaesarKey(){
      plaintext = plaintext.toLowerCase();
        String cipher = "";
        for (int i = 0; i < plaintext.length(); i++){
            int position = alphabet2.indexOf(CaesarCoder().charAt(i));
            int keyVal = (shift + position) % 26;
            char replaceVal = alphabet2.charAt(keyVal);
            cipher += replaceVal;        
            }
        return cipher;
    }
    
    public String VigenereKey(){
      String cipher = "";
      for (int x = 0; x != plaintext.length(); x++){
         for (int y = 0; y != codeword.length(); y++){
            if (cipher.length() == plaintext.length())
            break;
            cipher += codeword.charAt(y);
            }
         }
      return cipher;
      }
    
    public String VigenereCoder(){
       plaintext = plaintext.toLowerCase();
       codeword = VigenereKey();
       String cipher = "";
         for (int i = 0; i != plaintext.length(); i++){
            if (((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'y') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'e')) ||
            ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 't') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'o') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'j') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'e') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'y')) ||
            ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'z'))){
               cipher+="a";
            }
            else if (((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'z') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'u') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'p') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'k') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'f') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'z'))){
               cipher+="b";
            }
            else if (((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'a') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'v') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'q') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'l') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'g') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'z'))){
               cipher+="c";
            }
            else if (((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'b') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'w') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'r') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'm') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'h') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'z'))){
               cipher+="d";
            }
            else if (((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'c') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'x') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 's') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'n') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'i') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'z'))){
               cipher+="e";
            }
            else if (((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'd') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'y') &&
             (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'j')) || 
             ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 't') && 
             (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'o')) || 
             ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'o') && 
             (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 't')) ||
              ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'j') && 
              (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'y')) || 
              ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'z'))){
               cipher+="f";
            }
            else if (((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'e') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'z') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'j')) ||
            ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'u') &&
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'o')) ||
            ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'p') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 't')) ||
            ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'k') &&
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'z'))){
               cipher+="g";
            }
            else if (((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'f') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'a') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'v') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'q') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'l') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'z'))){
               cipher+="h";
            }
            else if (((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'g') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'b') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'w') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'r') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'm') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'z'))){
               cipher+="i";
            }
            else if (((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'h') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'c') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'x') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 's') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'n') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'z'))){
               cipher+="j";
            }
            else if (((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'i') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'd') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'y') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 't') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'o') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'z'))){
               cipher+="k";
            }
            else if (((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'j') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'e') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'z') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'u') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'p') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'z'))){
               cipher+="l";
            }
            else if (((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'k') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'f') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'a') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'v') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'q') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'z'))){
               cipher+="m";
            }
            else if (((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'l') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'g') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'b') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'w') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'r') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'z'))){
               cipher+="n";
            }
            else if (((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'm') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'h') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'c') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'x') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 's') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'z'))){
               cipher+="o";
            }
            else if (((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'n') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'i') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'd') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'y') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 't') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'z'))){
               cipher+="p";
            }
            else if (((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'o') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'j') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'e') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'z') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'u') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'z'))){
               cipher+="q";
            }
            else if (((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'p') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'k') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'f') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'a') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'v') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'z'))){
               cipher+="r";
            }
            else if (((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'q') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'l') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'g') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'b') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'w') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'z'))){
               cipher+="s";
            }
            else if (((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'r') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'm') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'h') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'c') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'x') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'z'))){
               cipher+="t";
            }
            else if (((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 's') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'n') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'i') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'd') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'y') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'z'))){
               cipher+="u";
            }
            else if (((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 't') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'o') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'j') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'e') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'z') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'z'))){
               cipher+="v";
            }
            else if (((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'u') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'p') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'k') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'f') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'a') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'z'))){
               cipher+="w";
            }
            else if (((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'v') && 
            (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'd')) || ((codeword.charAt(i) == 't') && (plaintext.charAt(i) == 'e')) || 
            ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 'q') && 
            (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'i')) || ((codeword.charAt(i) == 'o') && (plaintext.charAt(i) == 'j')) || 
            ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'l') && 
            (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'n')) || ((codeword.charAt(i) == 'j') && (plaintext.charAt(i) == 'o')) || 
            ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'g') && 
            (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 's')) || ((codeword.charAt(i) == 'e') && (plaintext.charAt(i) == 't')) || 
            ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'b') && 
            (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'x')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'y')) || 
            ((codeword.charAt(i) == 'y') && (plaintext.charAt(i) == 'z'))){
               cipher+="x";
            }
            else if (((codeword.charAt(i) == 'a') && (plaintext.charAt(i) == 'z')) || ((codeword.charAt(i) == 'z') && (plaintext.charAt(i) == 'a')) || ((codeword.charAt(i) == 'y') && 
            (plaintext.charAt(i) == 'b')) || ((codeword.charAt(i) == 'x') && (plaintext.charAt(i) == 'c')) || ((codeword.charAt(i) == 'w') && (plaintext.charAt(i) == 'd')) || 
            ((codeword.charAt(i) == 'v') && (plaintext.charAt(i) == 'e')) || ((codeword.charAt(i) == 'u') && (plaintext.charAt(i) == 'f')) || ((codeword.charAt(i) == 't') && 
            (plaintext.charAt(i) == 'g')) || ((codeword.charAt(i) == 's') && (plaintext.charAt(i) == 'h')) || ((codeword.charAt(i) == 'r') && (plaintext.charAt(i) == 'i')) || 
            ((codeword.charAt(i) == 'q') && (plaintext.charAt(i) == 'j')) || ((codeword.charAt(i) == 'p') && (plaintext.charAt(i) == 'k')) || ((codeword.charAt(i) == 'o') && 
            (plaintext.charAt(i) == 'l')) || ((codeword.charAt(i) == 'n') && (plaintext.charAt(i) == 'm')) || ((codeword.charAt(i) == 'm') && (plaintext.charAt(i) == 'n')) || 
            ((codeword.charAt(i) == 'l') && (plaintext.charAt(i) == 'o')) || ((codeword.charAt(i) == 'k') && (plaintext.charAt(i) == 'p')) || ((codeword.charAt(i) == 'j') && 
            (plaintext.charAt(i) == 'q')) || ((codeword.charAt(i) == 'i') && (plaintext.charAt(i) == 'r')) || ((codeword.charAt(i) == 'h') && (plaintext.charAt(i) == 's')) || 
            ((codeword.charAt(i) == 'g') && (plaintext.charAt(i) == 't')) || ((codeword.charAt(i) == 'f') && (plaintext.charAt(i) == 'u')) || ((codeword.charAt(i) == 'e') && 
            (plaintext.charAt(i) == 'v')) || ((codeword.charAt(i) == 'd') && (plaintext.charAt(i) == 'w')) || ((codeword.charAt(i) == 'c') && (plaintext.charAt(i) == 'x')) || 
            ((codeword.charAt(i) == 'b') && (plaintext.charAt(i) == 'y'))){
               cipher+="z";
            }
            else{
               cipher+="y";
            }
           }   
         return cipher;
         }
      }