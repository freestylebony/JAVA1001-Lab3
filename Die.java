/*This a class that describes die with its attributes 
 Lab3 Classes/Objects
 Name : Hafees Falana
 Student ID : A00240043
 */

public class Die {
	
	public String typeOfDie;
	public int numberOfSides;
	public int currentSide;

    //getters

	public String getName() {

		return typeOfDie;
	}

	public int getNumberOfSides() {

		return numberOfSides;
	}

	public int getCurrentSide() {

		return currentSide;
	}

	//A0 argument constructor

	public Die() {

		typeOfDie = "d4";
		numberOfSides = 4;
		
	}

	//A1 argument constructor

	public Die (int numberOfSides) {
      
      this.typeOfDie = "d" + numberOfSides;
      this.numberOfSides = numberOfSides;
      
	}

	//A2 argument constructor

	public Die (int numberOfSides, String typeOfDie) {

		this.numberOfSides = numberOfSides;
		this.typeOfDie = typeOfDie;
	}

	//A roll method to generate a random value

     public void setRollSide () {

     	currentSide = (int)(Math.random()*numberOfSides + 1);
     }

     public void setRollMaxSide () {

        currentSide = numberOfSides;	
     }

}