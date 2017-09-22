/*
	<Ameen Almiftah>		<4/8/2011>
	<class name: DiceTester
	 description: this class runs a test on a pair of dice and reports the followings;
	 the number, percentage, expected number, expected percentage, and variance of each possible total and doubles>
*/


import java.text.DecimalFormat;

public class DiceTester {
	private int [] tCounter;
	private int [] dCounter;
	private double n;
	
	public DiceTester(){ // a constructor to set the number if indexes for tCounter and dCounter
		tCounter = new int [13];
		dCounter = new int [7];
	}
	
	/*
	<method name: runTest
	description: this method fills the arrays of tCounter and dCounter by simulating n number of rolls >
	<preconditions: none>
	<postconditions: tCounter and dCounter arrays filled with dice rolls>
*/

	public void runTest(int n){
		this.n=n;
		Dice die = new Dice(); // to create a dice object
		for (int i = 0; i < n; i++){
			int t = die.rollDice();
			tCounter[t]++;
			int d = die.doubles();
			dCounter[d]++;
		}
	}
	/*
	<method name: report
	 description: this method is to display a formated report>
	<preconditions: none>
	<postconditions: none>
*/

	public void report(){
		int m = (int)n;
		System.out.println("Results for "+ m +" rolls of dice;" );// formating based on the example provided by the instructor
		System.out.println("	Actual						Expected			Variance");
		System.out.println("	Occurrencees		%			Occurrencees	  %		%");
		DecimalFormat dformat = new DecimalFormat("0.00");
		for (int i=2; i<=12; i++){
			double percent = (tCounter[i]/(n))*100.0;
			if (i == 2 || i == 12){
				double expectPercent = ((((n)/36)/n)*100.0);
				System.out.println(i+"		"+tCounter[i]+"		"+dformat.format(percent)+"			"+(n/36)+"		  "+ dformat.format(expectPercent)+"		"+dformat.format(percent-expectPercent));
			}
			if (i == 3 || i == 11){
				double expectPercent = (((n/18)/n)*100.0);
				System.out.println(i+"		"+tCounter[i]+"		"+dformat.format(percent)+"			"+(n/18)+"		  "+ dformat.format(expectPercent)+"		"+dformat.format(percent-expectPercent));
			}
			if (i == 4 || i == 10){
				double expectPercent = ((n/12)/n)*100.0;
				System.out.println(i+"		"+tCounter[i]+"		"+dformat.format(percent)+"			"+(n/12)+"		  "+ dformat.format(expectPercent)+"		"+dformat.format(percent-expectPercent));
			}
			if (i == 5 || i == 9){
				double expectPercent = ((n/9)/n)*100.0;
				System.out.println(i+"		"+tCounter[i]+"		"+dformat.format(percent)+"			"+(n/9)+"		  "+ dformat.format(expectPercent)+"		"+dformat.format(percent-expectPercent));
			}
			if (i == 6 || i == 8){
				double expectPercent = ((n/7.2)/n)*100.0;
				System.out.println(i+"		"+tCounter[i]+"		"+dformat.format(percent)+"			"+(n/7.2)+"		  "+ dformat.format(expectPercent)+"		"+dformat.format(percent-expectPercent));
			}
			if (i == 7){
				double expectPercent = ((n/6)/n)*100.0;
				System.out.println(i+"		"+tCounter[i]+"		"+dformat.format(percent)+"			"+(n/6)+"		  "+ dformat.format(expectPercent)+"		"+dformat.format(percent-expectPercent));
			}
		}
		
		System.out.println("Doubles rolled:");
		System.out.println("	Actual						Expected			Variance");
		System.out.println("	Occurrencees		%			Occurrencees	  %		%");		
		for (int i=1; i<=6; i++){
			double percent =(dCounter[i]/(n))*100.0;
			double expectPercent = (((n)/36)/(n))*100.0;
			System.out.println(i+"		"+dCounter[i]+"		"+dformat.format(percent)+"			"+(m/36)+"		  "+ dformat.format(expectPercent)+"		"+dformat.format(percent-expectPercent));
		}
	}
}
