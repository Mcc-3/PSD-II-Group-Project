/**
 * Created by Rachel on 08/03/2021
 * Creating an array list of players and checking that they are 18+
 **/
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;


public class playersAge
{
   //declare time variables
   private int years, months, days;

   public playersAge() {
   }//default

   public playersAge(int pYears, int pMonth, int pDays) {
      this.years = pYears;
      this.months = pMonth;
      this.days = pDays;
   }//players age

   public int getDays() {
      return this.days;
   }//get days

   public int getMonths() {
      return this.months;
   }//get months

   private int getYears() {
      return this.years;
   }//get years

   public static void main(String[] args)
   {
      //imports
      Scanner kb = new Scanner(System.in);
      Scanner input = new Scanner(System.in) ;

      //declare variables
      int year, month, dayOfMonth, numOfPlayers = 0, playersAge ;
      final int OFAGE = 18;

      //create array list
      ArrayList<players> arrPlayers = new ArrayList<>();

      //Enter the number of players
      System.out.println("How many players are in this game?");
      numOfPlayers = kb.nextInt();

      //for loop to create array and check age
      for (int loop = 0; loop < numOfPlayers; loop++) {
         System.out.print("Enter the name of player " + (loop + 1) + " :");
         String name = input.nextLine();
         players p1 = new players(); //creating players objects from players class
         p1.setName(name);
         arrPlayers.add(p1); //adding to array list
         System.out.println("Enter date: ") ;
         dayOfMonth = kb.nextInt();
         System.out.println("month: ");
         month = kb.nextInt();
         System.out.println("year: ");
         year = kb.nextInt();

         //calculating date of birth from today
         LocalDate today = LocalDate.now();
         LocalDate birthday = LocalDate.of(year, month, dayOfMonth);
         Period p = Period.between(birthday, today);

         playersAge = p.getYears();

         if (playersAge < OFAGE) {
            System.out.println("You must be at least 18 to play this game.  " + "\nPlease exit game");
         }//if
      }//for

   }//main
}//class
