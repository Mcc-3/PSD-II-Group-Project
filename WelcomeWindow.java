/**
 * Created by Rebecca Burke, Mark Campbell on 12/02/2021
 * The program below is the welcome window for our gaming console. It's a class which allows us to amalgamate
 * and display each of the games within our project. Its main functionality includes Welcoming the users, providing
 * them with a selection of game, giving the user some background on each game and executing each game.
 **/

// Importing the necessary libraries
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WelcomeWindowV6
{
   // Declaring the scanner class which will allow us to read and use the users input
   static Scanner keyboard = new Scanner(System.in);

   // Declaring the necessary variables for the class
   // Declaring the variable gameSelection which will store the users choice of game
   private static int gameSelection;
   // Declaring a boolean variable invalid which will be used in do-while loops to prevent the user from moving
   // forward until their entry is valid.
   static boolean invalid = true;
   // Declaring the back option variable which will allow the user to revert back to the welcome window
   static int backOption;

   // Declaring a method which will welcome the user to the gaming application
   private static void welcome(){
      // Welcoming the user to the game application
      JOptionPane.showMessageDialog(null, "Welcome to Divoc Gaming\n");
      // Giving a brief description of the application
      JOptionPane.showMessageDialog(null, "Divoc is a console which allows \nyou to play " +
              "drinking games with your \nfriends virtually and safely.");
   }//Method: Welcome


   // Declaring a method which will provide the user with the gaming options available and allow them to make their
   // selection.
   private static void options(){

      // Declaring a do-while loop which will prevent the user from moving forward until their entry is valid
      do
      {
         // Resetting the invalid variable
         invalid = true;

         // Declaring a try-catch statement to prevent the user from entering anything other than the numbers
         // 1, 2, 3, 4, 5 or 6
         try
         {
            // Reading the users entry from the JOptionPane and storing it in the gameSelection variable.
            gameSelection = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Divoc Gaming supports the games\n" +
                            "1.) BattleShots 2.0\n" +
                            "2.) Rachel's game - Description\n" +
                            "3.) Seong's game - Description \n" +
                            "4.) Truth or Drink\n" +
                            "5.) Surprise me!\n" +
                            "6.) Exit\n" +
                            "Please select a game by entering the number\n " +
                            "associated with your chosen game from the menu above.",
                    "Options Window", JOptionPane.INFORMATION_MESSAGE));//Question for amount of rounds
            // Declaring an if statement which checks if the entry is one of the menu options and marks it as
            // valid if it is.
            if (Arrays.asList(1,2,3,4,5,6).contains(gameSelection)){
               // Setting the invalid variable to false only if gameSelction in list.
               invalid = false;
            };//if
         }//try
         catch (Exception entryError)
         {
            // Informing the user that the system doesn't accept a non-numeric format at this stage and asking them
            // to re-enter.
            JOptionPane.showMessageDialog(null, "ERROR - Entry Error\n"+
                    "Please enter a number from the options provided.");
         }//catch

      } while (invalid == true); //do-while: gameSelection

   }// Method: options


   public static void main(String[] args)
   {
      // Calling the welcome method to welcome the user to the application.
      welcome();
      // Calling the gaming options and prompting the user to make their selection.
      options();

      // Setting up a terminator for the following while loop
      String terminator = "play";

      // Declaring a while loop which allows the user to play multiple games/rounds back to back
      while (terminator != "exit")
      {
         // Declaring a switch statement which will call the game that the user has chosen to play
         switch (gameSelection)
         {
            // Calling Mark's game
            case 1:
               // Informing the user that they have selected BattleShots 2.0 and providing them with
               // a brief description of the game.
               JOptionPane.showMessageDialog(null, "BattleShots 2.0\n" + "Mark's game description");

               // Resetting the invalid variable
               invalid = true;

               // Declaring a do-while loop to prevent the user from moving on until their entry is valid
               do
               {
                  // Declaring a try-catch statement to prevent the user from entering anything other than
                  // the numbers 1 and 2
                  try
                  {
                     // Asking the user if they want to continue with their game selection
                     backOption = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to continue with this game?\n" +
                             "Please press 1 to enter the game and 2 to go back to the user menu."));

                     // Declaring an if statement which compares the user entry with the list
                     // of acceptable entries
                     if (Arrays.asList(1,2).contains(backOption)){

                        // Setting the invalid variable to false only if backOption is in the list.
                        invalid = false;
                     };//if
                  }//try
                  catch (Exception entryError)
                  {
                     // Informing the user that the game cannot  accept a non-numeric format at this stage.
                     JOptionPane.showMessageDialog(null, "ERROR - Entry Error\n" +
                             "Please enter a number.");
                  }//catch

               } while (invalid == true);//do-while

               // Declaring a switch statement which will run the users selection
               switch (backOption)
               {
                  // If the user selects 1 they will enter the BattleShots 2.0 game
                  case 1:
                     // Informing the user that they are entering BattleShots 2.0
                     JOptionPane.showMessageDialog(null, "You've chosen to enter BattleShots 2.0");
                     Battleshots2 battleshots = new Battleshots2();
                     battleshots.battleshotsStart();
                     break;
                  //If the user selects 2 the will return to the main gaming menu.
                  case 2:
                     // Informing the user that they are returning to the games menu.
                     JOptionPane.showMessageDialog(null, "You've chosen to return to the main menu.");
                     break;
                  default:
                     // Declaring a default message which informs the user that their selection is out of range
                     JOptionPane.showMessageDialog(null, "ERROR - Entry Error\n" +
                             "Please select either 1 to continue or 2 to go back.");
                     break;
               }// inner switch: BattleShots 2.0

               // Calling the options method to bring the user back to the main gaming menu and asking if they
               // wish to select another game
               options();
               break;
// --------------------------------------------------------------------------------------------------------------------
            // Calling Rachel's game to play
            case 2:
               // Informing the user that they have selected Rachel's game and providing them with
               // a brief description of the game.
               JOptionPane.showMessageDialog(null, "Rachel's Game\n" + "Rachel's Game Description");

               // Resetting the invalid variable to true
               invalid = true;

               // Declaring a do-while loop to prevent the user from moving on until their entry is valid
               do
               {
                  // Declaring a try-catch statement to prevent the user from entering anything other than
                  // the numbers 1 and 2
                  try
                  {
                     // Asking the user if they want to continue with their game selection
                     backOption = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to continue with this game?\n" +
                             "Please press 1 to enter the game and 2 to go back to the user menu."));

                     // Declaring an if statement which compares the user entry with the list
                     // of acceptable entries
                     if (Arrays.asList(1,2).contains(backOption)){

                        // Setting the invalid variable to false only if backOption is in the list.
                        invalid = false;
                     };//if
                  }//try
                  catch (Exception entryError)
                  {
                     // Informing the user that the game cannot  accept a non-numeric format at this stage.
                     JOptionPane.showMessageDialog(null, "ERROR - Entry Error\n" +
                             "Please enter a number.");
                  }//catch

               } while (invalid == true);//do-while

               // Declaring a switch statement which will run the users selection
               switch (backOption)
               {
                  // If the user selects 1 they will enter the Rachel's game
                  case 1:
                     // Informing the user that they are entering Rachel's game
                     JOptionPane.showMessageDialog(null, "You've chosen to enter Rachel's game");
                     /*


                     Enter your code here

                     */
                     break;
                  //If the user selects 2 the will return to the main gaming menu.
                  case 2:
                     // Informing the user that they are returning to the games menu.
                     JOptionPane.showMessageDialog(null, "You've chosen to return to the main menu.");
                     break;
                  default:
                     // Declaring a default message which informs the user that their selection is out of range
                     JOptionPane.showMessageDialog(null, "ERROR - Entry Error\n" +
                             "Please select either 1 to continue or 2 to go back.");
                     break;
               }// inner switch: Rachel's game

               // Calling the options method to bring the user back to the main gaming menu and asking if they
               // wish to select another game
               options();
               break;
// --------------------------------------------------------------------------------------------------------------------
            // Calling Seong's game
            case 3:
               // Informing the user that they have selected Seong's game and providing them with
               // a brief description of the game.
               JOptionPane.showMessageDialog(null, "Seong's Game\n" + "Seong's Game Description");

               // Resetting the invalid variable to true
               invalid = true;

               // Declaring a do-while loop to prevent the user from moving on until their entry is valid
               do
               {
                  // Declaring a try-catch statement to prevent the user from entering anything other than
                  // the numbers 1 and 2
                  try
                  {
                     // Asking the user if they want to continue with their game selection
                     backOption = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to continue with this game?\n" +
                             "Please press 1 to enter the game and 2 to go back to the user menu."));

                     // Declaring an if statement which compares the user entry with the list
                     // of acceptable entries
                     if (Arrays.asList(1,2).contains(backOption)){

                        // Setting the invalid variable to false only if backOption is in the list.
                        invalid = false;
                     };//if
                  }//try
                  catch (Exception entryError)
                  {
                     // Informing the user that the game cannot  accept a non-numeric format at this stage.
                     JOptionPane.showMessageDialog(null, "ERROR - Entry Error\n" +
                             "Please enter a number.");
                  }//catch

               } while (invalid == true);//do-while

               // Declaring a switch statement which will run the users selection
               switch (backOption)
               {
                  // If the user selects 1 they will enter the Seong's game
                  case 1:
                     // Informing the user that they are entering Seong's game
                     JOptionPane.showMessageDialog(null, "You've chosen to enter Seong's game");
                     /*


                     Enter your code here


                     */
                     break;
                  //If the user selects 2 the will return to the main gaming menu.
                  case 2:
                     // Informing the user that they are returning to the games menu.
                     JOptionPane.showMessageDialog(null, "You've chosen to return to the main menu.");
                     break;
                  default:
                     // Declaring a default message which informs the user that their selection is out of range
                     JOptionPane.showMessageDialog(null, "ERROR - Entry Error\n" +
                             "Please select either 1 to continue or 2 to go back.");
                     break;

               }// inner switch: Seong's game

               // Calling the options method to bring the user back to the main gaming menu and asking if they
               // wish to select another game
               options();
               break;
// --------------------------------------------------------------------------------------------------------------------
            // Calling the truth or drink game to play
            case 4:
               // Informing the user that they have selected Truth or Drink and providing them with
               // a brief description of the game.
               JOptionPane.showMessageDialog(null, "Truth or Drink\n" +
                       "In this game you will be provided with a number of questions to which you are expected\n" +
                       "answer truthfully. If you do not wish to answer the question you may forfeit by taking a drink.");

               // Resetting the invalid variable to true
               invalid = true;

               // Declaring a do-while loop to prevent the user from moving on until their entry is valid
               do
               {
                  // Declaring a try-catch statement to prevent the user from entering anything other than
                  // the numbers 1 and 2
                  try
                  {
                     // Asking the user if they want to continue with their game selection
                     backOption = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to continue with this game?\n" +
                             "Please press 1 to enter the game and 2 to go back to the user menu."));

                     // Declaring an if statement which compares the user entry with the list
                     // of acceptable entries
                     if (Arrays.asList(1,2).contains(backOption)){

                        // Setting the invalid variable to false only if backOption is in the list.
                        invalid = false;
                     };//if
                  }//try
                  catch (Exception entryError)
                  {
                     // Informing the user that the game cannot  accept a non-numeric format at this stage.
                     JOptionPane.showMessageDialog(null, "ERROR - Entry Error\n" +
                             "Please enter a number.");
                  }//catch

               } while (invalid == true);//do-while

               // Declaring a switch statement which will run the users selection
               switch (backOption)
               {
                  // If the user selects 1 they will enter the Truth or Drink game
                  case 1:
                     // Informing the user that they are entering BattleShots 2.0
                     JOptionPane.showMessageDialog(null, "You've chosen to enter the Truth or Drink game");

                     // Declaring the variable playModeTOD which will store the users game mode
                     int playModeTOD;

                     // Declaring a do-while loop which will prevent the user selecting an option greater than 2
                     do
                     {
                        // Calling  modeSelect method from the TruthOrDrinkV9 class and assigning the selection to playModeTOD
                        playModeTOD = TruthOrDrinkV9.modeSelect();

                        // Declaring a switch statement which will execute the users chosen mode of play
                        switch (playModeTOD)
                        {
                           // Entering the preset mode of Truth or Drink
                           case 1:
                              // Informing the user that they have selected the preset mode and asking them to choose their player order
                              JOptionPane.showMessageDialog(null, "You have selected to play with the preset questions.\n"+
                                      "Please select your player order and then press enter to begin");
                              // Calling the preDefined method from the TruthOrDrinkV9 class
                              TruthOrDrinkV9.preDefined();
                              // Informing the user that their current game has ended
                              JOptionPane.showMessageDialog(null, "This is the end of the game.\n"+
                                      "Thank you for playing Truth or Drink.");
                              break;
                           // Entering the user defined mode of Truth or Drink
                           case 2:
                              // Informing the user that they have selected the user-defined mode
                              JOptionPane.showMessageDialog(null, "You have selected to play with your own questions."+
                                      "\nYou will now need to decide and enter these into the system."+
                                      "\nDon't worry about the order in which you enter them as they will be shuffled before the game begins.");
                              // Calling the numberOfTruths method from the TruthOrDrinkV9 class
                              int noOtruths = TruthOrDrinkV9.numberOfTruths();
                              // Calling the user defined method from the TruthOrDrinkV9 class
                              TruthOrDrinkV9.userDefined(noOtruths);
                              // Informing the user that their current game has ended
                              JOptionPane.showMessageDialog(null, "This is the end of the game. Thank you for playing.");
                              break;
                           default:
                              // Informing the user that their entry is invalid
                              JOptionPane.showMessageDialog(null, "ERROR - Entry is outside the range of options available.\n"+
                                      "Please select from the options above.");
                              break;
                        }//Switch:TruthOrDrinkV9

                     } while ((TruthOrDrinkV9.gameMode == 0) || (TruthOrDrinkV9.gameMode > 2)); //do

                     //##################################################################################################################
                     break;
                  //If the user selects 2 the will return to the main gaming menu.
                  case 2:
                     // Informing the user that they are returning to the games menu.
                     JOptionPane.showMessageDialog(null, "You've chosen to return to the main menu.");
                     break;
                  default:
                     // Declaring a default message which informs the user that their selection is out of range
                     JOptionPane.showMessageDialog(null, "ERROR - Entry Error\n" +
                             "Please select either 1 to continue or 2 to go back.");
                     break;
               }// inner switch: backOption TruthOrDrinkV9

               // Calling the options method to bring the user back to the main gaming menu and asking if they
               // wish to select another game
               options();
               break;
            // Randomly selecting one of the games for the users to play
            case 5:
               /// Informing the user that they have selected surprise me and providing them with
               // a brief description of the game.
               JOptionPane.showMessageDialog(null, "You have chosen to play 'Surprise me!'.\n"+
                       "We will randomly select a game for you to play.");

               // Resetting the invalid variable to true
               invalid = true;

               // Declaring a do-while loop to prevent the user from moving on until their entry is valid
               do
               {
                  // Declaring a try-catch statement to prevent the user from entering anything other than
                  // the numbers 1 and 2
                  try
                  {
                     // Asking the user if they want to continue with their game selection
                     backOption = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to continue with this option?\n" +
                             "Please press 1 to enter the game and 2 to go back to the user menu."));

                     // Declaring an if statement which compares the user entry with the list
                     // of acceptable entries
                     if (Arrays.asList(1,2).contains(backOption)){

                        // Setting the invalid variable to false only if backOption is in the list.
                        invalid = false;
                     };//if
                  }//try
                  catch (Exception entryError)
                  {
                     // Informing the user that the game cannot  accept a non-numeric format at this stage.
                     JOptionPane.showMessageDialog(null, "ERROR - Entry Error\n" +
                             "Please enter a number.");
                  }//catch

               } while (invalid == true);//do

               // Declaring a switch statement which will run the users selection
               switch (backOption)
               {
                  // If the user selects 1 they will enter surprise me
                  case 1:
                     // Informing the user that they are entering BattleShots 2.0
                     JOptionPane.showMessageDialog(null, "You've chosen to enter Surprise me");

                     // Declaring an array list containing the game options
                     ArrayList<String> gamesAvailable = new ArrayList<String>();

                     // adding the game options to the array list
                     gamesAvailable.add("Battleshots 2.0");
                     gamesAvailable.add("Rachel's game");
                     gamesAvailable.add("Seong's game");
                     gamesAvailable.add("Truth or Drink");

                     // Declaring randomSelect as an instance of Random
                     Random randomSelect = new Random();

                     // Randomly selecting a game using randomSelect
                     int gameSelected = randomSelect.nextInt(gamesAvailable.size());

                     // Displaying the selected game to the screen
                     JOptionPane.showMessageDialog(null, "We've chosen...\n"+
                             gamesAvailable.get(gameSelected));

                     // Accessing the game that has been randomly selected
                     // If the first element in the array list has been selected then we want to play Mark's game
                     if (gameSelected == 0)
                     {
                        gameSelection = 1;
                     }
                     // If the second element in the array list has been selected then we want to play Rachel's game
                     else if (gameSelected == 1)
                     {
                        gameSelection = 2;
                     }
                     // If the third element in the array list has been selected then we want to play Seong's game
                     else if (gameSelected == 2)
                     {
                        gameSelection = 3;
                     }
                     // Else we want to play Rebecca's game
                     else
                     {
                        gameSelection = 4;
                     }

                     break;
                  //If the user selects 2 the will return to the main gaming menu.
                  case 2:
                     // Informing the user that they are returning to the games menu.
                     JOptionPane.showMessageDialog(null, "You've chosen to return to the main menu.");
                     break;
                  default:
                     // Declaring a default message which informs the user that their selection is out of range
                     JOptionPane.showMessageDialog(null, "ERROR - Entry Error\n" +
                             "Please select either 1 to continue or 2 to go back.");
                     break;
               }// inner switch: Surprise me

               // Calling the options method to bring the user back to the main gaming menu and asking if they
               // wish to select another game
               options();
               break;
// --------------------------------------------------------------------------------------------------------------------
            // Exiting the system
            case 6:
               // Informing the user that they are leaving the applicaiton
               JOptionPane.showMessageDialog(null, "We're sorry you're leaving, but thank you for playing!");

               // Setting the terminator to exit so that the while loop will stop
               terminator = "exit";
               break;
            // Declaring a default message for any entries which aren't in the cases
            default:
               // Informing the user that their input is invalid
               JOptionPane.showMessageDialog(null, "Your entry is invalid! Please enter a selection from the options available.");

               // Calling the options method to bring the user back to the main gaming menu and asking if they
               // wish to select another game
               options();
               break;
         } // switch statement for accessing the games
      } // While loop for exiting the system
   }//main
}//class
