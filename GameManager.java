import java.util.Scanner;
import java.io.*;

/**This class will create a game manager object 
which will do things like load and start the game.
*/
public class GameManager
{
   public static void main(String[] args)
   {
   
   }
   public static void welcomeScreen()
   {
      System.out.println("************************************************************\n" + 
                        "Welcome to Glaciation! An other worldly text based adventure!\n" +
                        "I invested quite a bit of time into this. I hope you enjoy!\n" +
                        "************************************************************\n");
   }

   /** This method will validate the user entry whether to start the game or not.
   Returning the entry to be used later on loadGame
   */
   public static String startGame()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter Start to Play.");
      String start = keyboard.nextLine();
      boolean playGame = false;
      while(playGame == false)
      {
         if(start.equalsIgnoreCase("Start"))
         {
            //System.out.println("I am start");
            playGame = true;
         }
         else
         {
            System.out.println(">Enter Start to Play.");
            start = keyboard.nextLine();
         }
      }
      return start;
   }
   
   /** This method will continue on from scenes when triggered by enter key
   */
   public static void continueOn()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println(">Press the Enter Key to continue.");
      String continueOn = keyboard.nextLine();
      boolean isEnter = false;
      while(!isEnter)
      {
         if(continueOn.equals(""))
         {
            System.out.println(".\n.\n.\n.\n.\n");
            isEnter = true;
         }
         else
         {
            System.out.println(">Press the Enter Key to continue.");
            continueOn = keyboard.nextLine();
         }
      }
   }
   
   public static void win()
   {
      System.out.println(">You defeated the enemy and know you can now complete your journey in peace!\n.\n.\n.");
      System.out.println(">Thank you so much for playing I hope you enjoyed!");
   }
   public static void gameOver()
   {
      System.out.println("You were gruesomely defeated. You have failed to achieve your goal and your journey has ended.");
      System.out.println("Please restart to play again!");
   }
   
   //Create GameWin and GameOver methods
}