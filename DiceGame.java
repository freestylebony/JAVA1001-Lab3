
/*Lab3 Classes/Objects
  Name : Hafees Falana
  Student ID : A00240043
  This lab demonstrates the use of objects and classes  to describe a dice game

*/

public class DiceGame {

  public static void main(String[] args) {

    Die s4 = new Die();
    Die s6 = new Die(6);
    Die s8 = new Die(8);
    Die[] arrayOfDice = {s4,s6,s8};

    //set the 3 dice and make the object array

    System.out.println("Creating a default " +s4.getName()); 
    System.out.println("Creating a default " +s6.getName());
    System.out.println("Creating a default " +s8.getName());
    
    //format spacing
    System.out.println();

    //current sides of the three dice
    s4.setRollSide();    
    s6.setRollSide();     
    s8.setRollSide();       

    System.out.println("The current side up for " +s4.getName() + " is " +s4.getCurrentSide());
    System.out.println("The current side up for " +s6.getName() + " is " +s4.getCurrentSide());
    System.out.println("The current side up for " +s8.getName() + " is " +s4.getCurrentSide());
    System.out.println();

    System.out.println("Testing the roll method");

    //format spacing
    System.out.println();
     
    //The sides of the dice after rolling
    s4.setRollSide();        
    s6.setRollSide();           
    s8.setRollSide();
    System.out.println();        

    System.out.println("Rolling the " +s4.getName() +"....." +'\n'+ "The new value is "+ s4.getCurrentSide());
    System.out.println("Rolling the " +s6.getName() +"....." + '\n'+ "The new value is "+ s6.getCurrentSide());
    System.out.println("Rolling the " +s8.getName() +"....." + '\n'+ "The new value is "+ s8.getCurrentSide()+'\n');

    int index = (int)(Math.random()*3); //This generates the random indexes of the array ( between 0 and 2)

    System.out.println("Setting the " + arrayOfDice[index].getName() +" dice to show "+arrayOfDice[index].getNumberOfSides()+'\n');

    //setting the max number of side to the current side
    arrayOfDice[index].setRollMaxSide();
    System.out.println("The side up is now "+arrayOfDice[index].getCurrentSide()+'\n');


  }





}