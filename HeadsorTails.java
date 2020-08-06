import java.util.Random;

public class HeadsorTails {

  public static void main(String[] args) {
    String[] CoinsSurface = { "Heads", "Tails" };
    Random a = new Random();

    System.out.println("Who are you?");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("Hello, " + name + "!");
    
    System.out.println("Tossing a coin...");
    int countH = 0;
    int countT = 0;
    for(int i = 0 ; i < 5 ; i++ ) {
      String CS = CoinsSurface[a.nextInt(2)];
      System.out.print("Round " + (i + 1) + ": ");
      System.out.println(CS);
      if(CS == "Heads"){
          countH++;
      }
      else countT++;
    }
    System.out.println("Heads: " + countH + ", Tails: " + countT);

    if(countH > countT){
        System.out.println(name + " won!");
      }
      else System.out.println(name + " lose!");
  }

}