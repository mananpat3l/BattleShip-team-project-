
import battleship.BattleShip;
/* We, Manan Patel and Deep Patel , 000826892 and 000818379 ,certify that this material is our original work.
 No other person's work has been used without due acknowledgement.*/
/**
 * Starting code for COMP10205 - Assignment#6
 * @author mark.yendt
 */


public class A6
{
  static final int NUMBEROFGAMES = 10000;
  public static void startSolution()
  {
    int totalShots = 0;
    int minShots = 100;
    int maxShots = 0;
    System.out.println(BattleShip.version());
    long start = System.nanoTime();
    for (int game = 0; game < NUMBEROFGAMES; game++) {

      BattleShip deathStar = new BattleShip();
      SampleBot emperorPalpatine = new SampleBot(deathStar);

      while (!deathStar.allSunk()) {
        emperorPalpatine.fireShot();

      }
      int gameShots = deathStar.totalShotsTaken();
      totalShots += gameShots;
      minShots = Math.min(gameShots, minShots);
      maxShots = Math.max(gameShots, maxShots);
    }
    System.out.printf("\nOurBot -> # Games = %d\n" +
    "         -> Average # Shots = *** %.2f ***\n"  +
            "         -> Maximum # Shots = %d\n" +
            "         -> Minimum # Shots = %d\n" +
            "         -> Total Time = %1.4f ms\n",
            NUMBEROFGAMES, (double)totalShots / NUMBEROFGAMES, maxShots, minShots,(double)(System.nanoTime() - start)/1000000);
  }
  public static void main(String[] args)
  {
    startSolution();
  }
}
