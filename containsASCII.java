import java.util.Scanner;
public class OnlyASCII {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string value: ");
      String input = sc.nextLine();
      //Verifying for ACCII
      boolean result = input.matches("\A\p{ASCII}*\z");
      if(result) {
         System.out.println("String approved");
      } else {
         System.out.println("Contains non-ASCII values");
      }
   }
}
