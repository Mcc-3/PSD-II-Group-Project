/**
 * Created by Rebecca Burke
 * The below program is the welcome window of our console. It's purpose is to amalgamate the games we have coded and
 * display them as playing options for the user to select from,
 **/
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class WelcomeWindow
{
   // Declaring the scanner class
   static Scanner keyboard = new Scanner(System.in);

   // Declaring the variable gameSelection
   private static int gameSelection;

   // Declaring a method which will welcome the user to the application,
   private static void welcome()
   {
      // Welcoming the user to the game
      System.out.println("\n\t\t\tWelcome to **INSERT NAME**. \n**INSERT NAME** is a console which allows you to play \ndrinking games with your friends virtually and safely.");

   }
   // prompt them to enter their selected game and stores the
   // entry from the keyboard in the variable gameSelection
   private static void options()
   {
      boolean pass = false;
      do
      {
         // Listing the games to the user
         System.out.println("\n\t\t**INSERT NAME** supports the games:");
         System.out.println("1.)\tBattleShots 2.0"); // Mark's game
         System.out.println("2.)\tRachel's game - Description"); // Rachel's game
         System.out.println("3.)\tSeong's game - Description"); // Seong's game
         System.out.println("4.)\tRebecca's game - Description"); // Rebecca's game
         System.out.println("5.)\tSurprise me! - We will decide on a game for you to play.");
         System.out.println("6.)\tExit");
         System.out.print("Please select a method of play by entering the number associated with your chosen game from the menu above : ");

         // Declaring the variable gameSelection and assigning it to the users game selection
         try
         {
            gameSelection = keyboard.nextInt();
            if (gameSelection >= 0)
            {
            pass = true;
            }else
            {
               System.out.println("Input must be greater that O");
            }//if user inputs 0 or less
         } catch (InputMismatchException error1)
         {
            System.out.println("Selection must be a number between 1 and 6");
            keyboard.nextLine();
            pass = false;
         }//If user inputs a letter
      } while (pass != true);
   }

   public static void main(String[] args)
   {
      welcome();
      options();

      // Setting up a terminator
      String terminator = "play";

      // Declaring a while loop which allows the user to continue playing after completing their initial game
      while (terminator != "exit")
      {
         // Declaring a switch statement which will call the game that the user has chosen to play
         switch (gameSelection)
         {

            case 1:
               // Mark's game code
               BattleShots2 battleshots = new BattleShots2();
               battleshots.battleshotsStart();
               // Asking the user if they wish to select another game
               options();
               break;
// --------------------------------------------------------------------------------------------------------------------
            // Calling Rachel's game to play
            case 2:
               // Rachel's game code
               System.out.println("Rachel");
                  /*
                  Enter your code here
                   */
               // Asking the user if they wish to select another game
               options();
               break;
// --------------------------------------------------------------------------------------------------------------------
            // Calling Seong's game to play
            case 3:
               // Seong's game code
               System.out.println("Seong");
                  /*
                  Enter your code here
                   */
               // Asking the user if they wish to select another game
               options();
               break;
// --------------------------------------------------------------------------------------------------------------------
            // Calling the truth or drink game to play
            case 4:
               // Rebecca's game code
               System.out.println("Rebecca");
                  /*
                  Enter your code here
                   */

               // Asking the user if they wish to select another game
               options();
               break;
            // Randomly selecting one of the games for the users to play
            case 5:
               // Surprise me code which randomly generates one of the games to play
               System.out.println("You have chosen to play 'Surprise me!'.");
               System.out.println("We will randomly select a game for you to play.");
               System.out.print("\tWe've chosen...");

               // Declaring an array with the list of game names
               ArrayList<String> gamesAvailable = new ArrayList<String>();
               // adding the game options
               gamesAvailable.add("BattleShots 2.0");
               gamesAvailable.add("Rachel's game");
               gamesAvailable.add("Seong's game");
               gamesAvailable.add("Rebecca's game");



               // Declaring randomSelect as an instance of Random
               Random randomSelect = new Random();

               // Randomly selecting a truth using randomSelect
               int gameSelected = randomSelect.nextInt(gamesAvailable.size());

               // printing the selected game on screen
               System.out.println(gamesAvailable.get(gameSelected) +"\n");
               keyboard.nextLine();

               // Accessing the game which has been randomly selected
               // If the first element in the array list has been selected then we want to play Mark's game
               if (gameSelected == 0){
                  gameSelection=1;
               }
               // If the second element in the array list has been selected then we want to play Rachel's game
               else if (gameSelected==1){
                  gameSelection=2;
               }
               // If the third element in the array list has been selected then we want to play Seong's game
               else if (gameSelected==2){
                  gameSelection=3;
               }
               // Else we want to play Rebecca's game
               else{
                  gameSelection=4;
               }
               break;
// --------------------------------------------------------------------------------------------------------------------
            // Exiting the system
            case 6:
               System.out.println("We're sorry you're leaving, but thank you for playing!");
               // Setting the terminator to play so that the while loop will continue
               terminator = "exit";
               break;
            // Declaring a default message for any entries which aren't in the cases
            default:
               // Asking the user to enter a valid input
               System.out.println("Your entry is invalid! Please enter a selection from the options available.");
               // Assigning the gameSelection variable to the users game selection
               gameSelection = keyboard.nextInt();
               break;
         } // switch statement for accessing the games
      } // While loop for exiting the system

   }//main
}//class
