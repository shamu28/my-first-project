import java.util.Scanner;
public class GuessNumber {
  public static void main(String[] args) {
    int secret = 7;
    Scanner sc = new Scanner(System.in);
    System.out.print("Guess the number: ");
    int guess = sc.nextInt();
    if (guess == secret) {
      System.out.println("Correct guess!");
    }else{
      System.out.println("Wrong guess.");
    }
  }
}
