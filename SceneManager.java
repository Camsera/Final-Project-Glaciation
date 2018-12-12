import java.util.Scanner;
import java.io.*;

public class SceneManager
{
   public static void main(String[] args) throws IOException
   {
   
   }
   public static void loadScene(String scene) throws IOException
   {
      File file = new File(scene);
      Scanner inputFile = new Scanner(file);
      while(inputFile.hasNext())
      {
         String readScene = inputFile.nextLine();
         System.out.println(readScene);
      }
      inputFile.close();
   }
   public static void thirdSceneChoice() throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println(">What would you like to do?");
      String choice = keyboard.nextLine();
      boolean validChoice = false;
      while(!validChoice)
      {
         if(choice.equals("1"))
         {
            loadScene("fifthScene.txt");
            fifthSceneChoice();
            validChoice = true;
         }
         else if(choice.equals("2"))
         {
            loadScene("fourthScene.txt");
            fourthSceneChoice();
            validChoice = true;
         }
         else
         {
            System.out.println(">What would you like to do?");
            choice = keyboard.nextLine();
         }
      }
   }
   
   /**This will load the fourth scene choice to go back to third
   */
   public static void fourthSceneChoice() throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println(">Press Enter to start your journey");
      String enterPressed = keyboard.nextLine();
      boolean notEnter = false;
      while(!notEnter)
      {
         if(enterPressed.equals(""))
         {
            loadScene("fifthScene.txt");
            fifthSceneChoice();
            notEnter = true;
         }
         else
         {
            System.out.println(">Press Enter to start your journey");
            enterPressed = keyboard.nextLine();
         }
      }
   }
   /**This will be the fifth Scene choice method
   giving multiple branches to choose from
   while also housing a secret choice
   */
   public static void fifthSceneChoice() throws IOException
   {
      FinalScene fs = new FinalScene();
      Scanner keyboard = new Scanner(System.in);
      System.out.println(">What would you like to do?");
      String choice = keyboard.nextLine();
      boolean validChoice = false;
      while(!validChoice)
      {
         if(choice.equals("1"))
         {
            loadScene("seventhScene.txt");
            seventhSceneChoice();
            validChoice = true;
         }
         else if(choice.equals("2"))
         {
            loadScene("sixthScene.txt");
            fs.getSword();
            sixthSceneChoice();
            validChoice = true;
         }
         else if(choice.equals("3"))
         {
            loadScene("eighthScene.txt");
            eighthSceneChoice();
            validChoice = true;
         }
         else
         {
            System.out.println(">What would you like to do?");
            choice = keyboard.nextLine();
         }
      }
   }
   /**This will be the sixthScreenChoice to go back
   On this scene it will also call a get weapon method 
   from player class
   */
   public static void sixthSceneChoice() throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println(">Press Enter to continue forward");
      String enterPressed = keyboard.nextLine();
      boolean notEnter = false;
      while(!notEnter)
      {
         if(enterPressed.equals(""))
         {
            loadScene("eighthScene.txt");
            eighthSceneChoice();
            notEnter = true;
         }
         else
         {
            System.out.println(">Press Enter to continue forward");
            enterPressed = keyboard.nextLine();
         }
      }
   }
   /** This will be seventhSceneChoice to go back
   this is a dead end path
   */
   public static void seventhSceneChoice() throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println(">Press Enter to continue forward");
      String enterPressed = keyboard.nextLine();
      boolean notEnter = false;
      while(!notEnter)
      {
         if(enterPressed.equals(""))
         {
            loadScene("eighthScene.txt");
            eighthSceneChoice();
            notEnter = true;
         }
         else
         {
            System.out.println(">Press Enter to continue forward");
            enterPressed = keyboard.nextLine();
         }
      }
   }
   /**Eighth scene choice will have 4 branches similar to 5
   One option will load final area
   */
   public static void eighthSceneChoice() throws IOException
   {
      FinalScene fs = new FinalScene();
      String eleventhScene = "eleventhScene.txt";
      Scanner keyboard = new Scanner(System.in);
      System.out.println(">What would you like to do?");
      String choice = keyboard.nextLine();
      boolean validChoice = false;
      while(!validChoice)
      {
         if(choice.equals("1"))
         {
            loadScene("ninthScene.txt");
            ninthSceneChoice();
            validChoice = true;
         }
         else if(choice.equals("2"))
         {
            fs.finalScene();
            fs.fightScene();
            //eleventhSceneChoice();
            //This will load the boss fight so I have to figure that out
            validChoice = true;
         }
         else if(choice.equals("3"))
         {
            loadScene("tenthScene.txt");
            fs.getBlessing();
            tenthSceneChoice();
            validChoice = true;
         }
         else
         {
            System.out.println(">What would you like to do?");
            choice = keyboard.nextLine();
         }
      }
   }
   /**Ninth scene choice will go back, dead end
   */
   public static void ninthSceneChoice() throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println(">Press Enter to go back");
      String enterPressed = keyboard.nextLine();
      boolean notEnter = false;
      while(!notEnter)
      {
         if(enterPressed.equals(""))
         {
            loadScene("eighthScene.txt");
            eighthSceneChoice();
            notEnter = true;
         }
         else
         {
            System.out.println(">Press Enter to go back");
            enterPressed = keyboard.nextLine();
         }
      }
   }
   /**tenth scene choice() will have one choice
   it will also raise players health by 50% by calling
   blessing()
   */
   public static void tenthSceneChoice() throws IOException
   {
      FinalScene fs = new FinalScene();
      Scanner keyboard = new Scanner(System.in);
      System.out.println(">When you're ready, press Enter");
      String enterPressed = keyboard.nextLine();
      boolean notEnter = false;
      while(!notEnter)
      {
         if(enterPressed.equals(""))
         {
            fs.finalScene();
            fs.fightScene();
            notEnter = true;
         }
         else
         {
            System.out.println(">When you're ready, press Enter");
            enterPressed = keyboard.nextLine();
         }
      }
      //Call some sort of blessing() method to raise players HP
   }
}