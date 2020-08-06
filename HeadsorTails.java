import java.util.Random;

public class HeadsorTails {

  public static void main(String[] args) {
    String[] CoinsSurface = { "Heads", "Tails" };
    Random a = new Random();
    
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
        System.out.println("You won!");
      }
      else System.out.println("You lose!");
  }

}