import java.util.*;

public class CharacterPrinter implements Runnable {

 private char startChar;

 private char endChar;

 

 public CharacterPrinter(char startChar, char endChar) {

 this.startChar = startChar;

 this.endChar = endChar;

 }

 

 public void run() {

 for (char ch = startChar; ch <= endChar; ch++) {

 System.out.print(ch + " ");

 try {

 Thread.sleep(1000); 
 // Waiting for one Second

 } catch (InterruptedException e) {

 e.printStackTrace();

 }

 }

 }

 

 public static void main(String[] args) {

 Scanner s=new Scanner (System.in);

 System.out.println("Enter the Starting Character:-");

 char startChar =s.next().charAt(0);

 System.out.println("Enter the Ending Character:-");

 char endChar = s.next().charAt(0);

 

 CharacterPrinter characterPrinter = new CharacterPrinter(startChar, endChar);

 Thread thread = new Thread(characterPrinter);

 thread.start();

 }

}
