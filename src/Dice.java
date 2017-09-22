/*
	<Ameen Almiftah>		<4/8/2011>
	<class name: Dice,
	description: this class simulates a pair of dice rolling>
*/


import java.util.Random;


public class Dice {
	
	   private Random rand = new Random();
	   private int die1SideUp,die2SideUp; 
	   
	   
	   /*
		<method name:randomInt
		 description: generates a random int between two integers loVal and hiVal>
		<preconditions: none>
		<postconditions: none>
	   */
	   private int randomInt(int loVal, int hiVal){

		   int randomNum = loVal+ rand.nextInt(hiVal);
		   return randomNum;
	   }
	   
	   /*
		<method name: rollDice
		description : sets the value of the two dice to a random number between 1 and 6 and returns the total value>
		<preconditions: none>
		<postconditions: die1SideUp and die2SideUp set to a random number>
	   */

	 	public int rollDice() {
	 		die1SideUp = randomInt(1,6);
	 		die2SideUp = randomInt(1,6);
	 		return die1SideUp+die2SideUp;
	 	}
	 	
	 	/*
		<method name: doubles
		 description: this method returns the number of the dice if they are both the same otherwise it returns 0>
		<preconditions: none>
		<postconditions: none>
	*/

	 	public int doubles(){
	 		if ( die1SideUp == die2SideUp){
	 			return die2SideUp;
	 		}else{
	 			return 0;
	 		}
	 	}


}