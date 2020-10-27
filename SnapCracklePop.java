/**
* A class representing a game named SnapCracklePop
* @author Arham Choraria
* @version 1.0
*/

public class SnapCracklePop {
   /**
   * Integer variable storing the value of snap 
   */
   private static int Snap;
   /**
   * Integer variable storing the value of crackle
   */
   private static int Crackle;
   /**
   * Integer variable storing the value of pop
   */
   private static int Pop;

   /**
   * Constructor initializng Snap to snap, Crackle to crackle and Pop to pop
   * @param snap integer number of snap
   * @param crackle integer number of crackle
   * @param pop integer number of pop
   */
   
   public SnapCracklePop (int snap, int crackle, int pop) {
      Snap = snap;
      Crackle = crackle;
      Pop = pop;
   }
   
   /**
   * Prints the rounds for the playGame method 
   * @param round stores the number of rounds 
   * @return a String representing the result of the game 
   */ 
 
   public static String playRound(int round) {
      String result = "";
      int rounds = round;
      String count = "";
      result += "Round " + rounds + ": ";
      
      if (rounds % getSnap() == 0 || rounds % getCrackle() == 0 || rounds % getPop() == 0) {
         if (rounds % getSnap() == 0) 
            count += "S";
         if (rounds % getCrackle() == 0) 
            count += "C";
         if (rounds % getPop() == 0) 
            count += "P";
         
         for (int i = 0; i < count.length(); i++) {
            char ch = count.charAt(i);
            if (ch == 'S')
               result += "snap";
            if (ch == 'C')
               result += "crackle";
            if (ch == 'P')
               result += "pop";
        }
      }
      else {
         result = result + rounds;
      }
      result += "\n";
      
      return result;    
  }

   /**
   * prints the result of the game 
   * @param Round stores the number of rounds 
   * @return a String representing the result of the game
   */ 

   public static String playGame(int Round) {
      String resultGame = "";
      int i = 1;
      while (i <= Round) {
         resultGame = resultGame + playRound(i);
         i++;
      }
      return resultGame;
   }

   /**
   * gets the value of Snap
   * @return an int value representing Snap 
   */ 

   public static int getSnap() {
      return Snap;
   }

   /**
   * gets the value of Crackle
   * @return an int value representing Crackle 
   */ 
 
    public static int getCrackle() {
      return Crackle;
   }
     
   /**
   * gets the value of Pop
   * @return an int value representing Pop
   */ 
   
    public static int getPop() {
      return Pop;
   }
}