import java.util.Scanner;

/**
 * Created by  on
 * COMMENTS ABOUT PROGRAM HERE
 **/
public class players
{
   //declare variables
   private String name ;
   private int score ;

   public players() {
   }//constructor

   public players(String pName, int pScore){
      name = pName ;
      score = pScore ;
   }//alternative

   public void setName(String pName){
   name = pName ;
   }//set name

   public String getName(){
   return name ;
   }//get name

}//class
