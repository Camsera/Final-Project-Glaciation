import java.util.Scanner;
import java.io.*;
import java.util.Random;


public class FinalScene
{

   /** I know declaring global variables is not good practice but 
   to achieve what I want, this was the only way I could understand
   how to do it. */
      //Create character
     //Player Details
   static int playerHealth = 75; //to be accessed by another method while still being used in fightScene
   static int maxAttack = 15;

   
   public static void main(String[] args) throws IOException
   {
      System.out.println(playerHealth);
      System.out.println(maxAttack);

   }
   //Create final scene which will include battle mechanics
   public static void finalScene() throws IOException
   {
      
      File file = new File("eleventhScene.txt");
      Scanner inputFile = new Scanner(file);
      while(inputFile.hasNext())
      {
         String readScene = inputFile.nextLine();
         System.out.println(readScene);
      }
      inputFile.close();
   }
   
   /**This method will load the final fight Scene. 
   There's a lot of messy logic in here and arguably it's not really a method
   and more just a main, but whatever.
   */   
   public static void fightScene() throws IOException
   {   
      //Create GameManager/Random object
      GameManager gameManager = new GameManager();
      Random rand = new Random();
     
     //more player details 
     int playerAttack;
     int firstAid = 10;
     int firstAidPacks = 3;
     
     //Create enemy
     //Enemy Details
     int maxEnemyHealth = 120;
     int maxEnemyAttack = 12;
     int enemyAttack;
     
     //Flavor for fun
     String[] adjective = {"fiercely", "swiftly", "nimbly", "heavily"};
     
     while(maxEnemyHealth > 0)
     {
         playerAttack = rand.nextInt(maxAttack);
         enemyAttack = rand.nextInt(maxEnemyAttack);
         
         System.out.println(">What would you like to do?");
         System.out.println(">1.Attack");
         System.out.println(">2.Heal");
         System.out.println(">3.Run");
         Scanner keyboard = new Scanner(System.in);
         String choice = keyboard.nextLine();
     
         if(choice.equals("1"))
         {
            System.out.println(">You attack " + adjective[rand.nextInt(adjective.length)] + " for " + playerAttack + " damage!\n");
            maxEnemyHealth -= playerAttack;
            //System.out.println(playerAttack);
            System.out.println(">The enemy attacks you back " + adjective[rand.nextInt(adjective.length)] + "!\n");
            playerHealth -= enemyAttack;
            //System.out.println(enemyAttack);
            System.out.println(">You have " + playerHealth + " health left.\n");
            if(playerHealth < 1)
            {
               gameManager.gameOver();
            }
          }
          else if(choice.equals("2"))
          {
            if(firstAidPacks > 0)
            {
               System.out.println(">You heal yourself for " + firstAid + " hit points.");
               playerHealth += firstAid;
               System.out.println(">Your health is now " + playerHealth + ".\n");
               firstAidPacks--;
               if(firstAidPacks < 1)
               {
                  System.out.println(">You are out of first aid packs\n");
               }
            }
          }
          else if(choice.equals("3"))
          {
            System.out.println(">You realize deep down, you can't escape this fight.\n");
            System.out.println(">You must fight!\n");
          }
          else
          {
            System.out.println(">What would you like to do?");
            System.out.println(">1.Attack");
            System.out.println(">2.Heal");
            System.out.println(">3.Run");
          }
      }
      
      gameManager.win();  
   }
   
   /**This method will add attack power to the character if they find the secret area.
   */
   public static void getSword()
   {
      maxAttack = 25;
   }
   /**This method will add a health bonus upon recieving a blessing
   */
   public static void getBlessing()
   {
      playerHealth = 100;
   }
}