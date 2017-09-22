/*
	<Ameen Almiftah>		<4/8/2011>
	<class name: UserInterface
	 description: this class provides a keyboard based user interface>
*/


import java.util.Scanner;

public class UserInterface {
	private Scanner usi = new Scanner(System.in);
	

	public String getString (String prompt) {// a getter to get readings from the keyboard
			System.out.print(prompt);
			String str = usi.nextLine();
			return str;
	}
	
	/*
	<method name: validInt
	 description: validates entered number if its between loVal and hiVal  by calling getString>
	<preconditions: none>
	<postconditions: none>
*/
	public int validInt (String prompt,int loVal, int hiVal) {
		int enteredValue = 0;
		do{
			String str = getString(prompt);
			enteredValue = Integer.parseInt(str);
			if (enteredValue <= loVal || enteredValue >= hiVal){
				System.out.println("Enter A Value Between 1,000 and 1,000,000");
			}
		}while (enteredValue <= loVal || enteredValue >= hiVal);
		
		return enteredValue;
	}
	
	/*
	<method name: agrees
	 description: asks a question and validates the answer, it returns true if y or Y entered and false if n or N entered>
	<preconditions: none>
	<postconditions: none>
*/

	public boolean agrees (String question) {

		while (true){
		System.out.println(question);
		String userInput = usi.nextLine();
		char ch = userInput.charAt(0);
		if (ch == 'y' || ch == 'Y'){
			return true;
		}
		else if (ch == 'n' || ch == 'N'){
			return false;
		}else{
			System.out.print("Enter y or n.");
			return true;
		}
		}
	}
}
