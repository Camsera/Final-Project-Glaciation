import java.util.Scanner;
import java.io.*;

/**-------------------------------------------------------------------------
This will be my final project. The beginnings to a text based adventure game
that I will be calling "Glaciation". Because I'm doing this procedurally
I will be encapsulating the entire thing here and keeping it as efficient
as I can. 
--------------------------------------------------------------------------*/

public class Glaciation
{
   public static void main(String[] args) throws IOException
   {
      //Start with instantiating Scanner/GameManager/Scene Manager
      Scanner keyboard = new Scanner(System.in);
      GameManager gameManager = new GameManager();
      SceneManager sceneManager = new SceneManager();
      gameManager.welcomeScreen();
      
      //Start game
      gameManager.startGame();
      
      //First Scene will describe the game
      sceneManager.loadScene("firstScene.txt");            //Load First Scene
      gameManager.continueOn();                           //Continue on
      //Second Scene will describe the player
      sceneManager.loadScene("secondScene.txt");        //Load Second Scene
      gameManager.continueOn();                        //Continue on
      //Third Scene will have 2 choices to move forward 
      sceneManager.loadScene("thirdScene.txt");      //Load third Scene
      sceneManager.thirdSceneChoice();
      //Game should continue on through Scene Manager
         
      //inputFile.close();
   }
}