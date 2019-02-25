package torakaji.rocks;

import java.util.Random;
import java.util.Scanner;

public class NumTimesWithRandomValues {

  static Random rnd = new Random();
  static Scanner test = new Scanner(System.in);
  static int goal = 15000-14603;
  static int minValue = getScore(20);
  static int maxValue = getScore(10);

  public static void main(String[] args) {
    for(int i = 0;i<3;i++){
      int numTimes = 0;
      int tempGoal = 0;
      while (tempGoal < goal) {
        numTimes++;
        switch (i){
          case 0:
            tempGoal += rnd.nextInt(maxValue + 1 - minValue) + minValue;
            break;
          case 1:
            tempGoal += maxValue;
            break;
          case 2:
            tempGoal += minValue;
        }
      }
      switch (i){
        case 0:
          System.out.println("Approximate plays until goal acheived: " + numTimes);
          break;
        case 1:
          System.out.println("Plays until goal acheived at max rating: " + numTimes);
          break;
        case 2:
          System.out.println("Plays until goal acheived at min rating: " + numTimes);
          break;
      }
    }

  }
  private static int getScore(int placement){
    return 100-placement;
  }
}

