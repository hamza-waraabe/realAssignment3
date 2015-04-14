
import javax.swing.JOptionPane;

public class Real3 {
	



	public static void main(String[] args) {

		String[] choices = { "Admin", "Student", "Staff"};

		String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 

		

			String User, Pass , prompt;

			int limit = 3,trial=0;

			User = JOptionPane.showInputDialog("Enter username: ");

			if (!User.equals("Hamza")){

				trial = trial + 1;

			while(!User.equals("Hamza") && trial<limit){

			User = JOptionPane.showInputDialog("Invalid username. Please try again: ");

			if(!User.equals("Hamza")){

			trial++;

			}

				else{

			trial = trial + 0;

			}

			}

			}

			if (trial<limit){

			Pass = JOptionPane.showInputDialog("Enter password: ");

			if(!Pass.equals("999")){

			trial = trial + 1;}

			while(!Pass.equals("999") && trial<limit){

			Pass = JOptionPane.showInputDialog("Invalid password. Please try again: ");

			if(!Pass.equals("999")){

				trial++;

			}

				else{

				trial = trial+0;

				

			}

			}

						

			}

					

			

				if (trial == limit){

			JOptionPane.showMessageDialog(null,"Contact Administrator");

			System.exit(0);

			}

			

								

			

			switch (input){

			case "Admin":

				JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");

				break;

			case "Student":

				JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
}
	}}