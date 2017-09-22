
/*
	<Ameen Almiftah>		<4/8/2011>
	<Random Number Tester (Dice Roller)>
	<This program simulates rolling a standard pair of dice n times,
	 it reports the number of times rolled (n),
	 the number, percentage, expected number, expected percentage, and variance of each possible total and doubles>
*/

public class client {

	public static void main(String[] args) {
		UserInterface UI = new UserInterface();
		do{
			int n = UI.validInt("How many rolls of dice?", 1000, 1000000); 
			DiceTester test = new DiceTester(); 
			test.runTest(n);
			test.report();
		}while (UI.agrees("Another test (y/n)?"));
	}
}
