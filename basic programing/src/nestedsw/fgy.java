package nestedsw;

public class fgy {

	public static void main(String[] args) {
		import java.util.Scanner;

		/**
		 * Class to reverse each words of a string
		 */
		public class ReverseStringWords {

		    /**
		     * System.out.println utility method
		     *
		     * @param value : value to print
		     */
		    static void print(String value) {
		        System.out.println(value);
		    }


		    /**
		     * Reverse the words in a string
		     *
		     * @param inputString : String to reverse the words
		     * @return : Result String
		     */
		    static String reverseWordsInString(String inputString) {

		        //first split the string by space
		        String[] splitStringArray = inputString.split(" ");

		        //create a stringbuilder object to store the result
		        StringBuilder resultBuilder = new StringBuilder();

		        //scan the string and rotate each words
		        for (String word : splitStringArray) {
		            if (!word.equals(" ")) {
		                //only check for non-empty words

		                //create one StringBuilder with the string word
		                StringBuilder sb = new StringBuilder(word);

		                //reverse the string builder and convert it to a string
		                String reverseString = sb.reverse().toString();

		                //append the string to the result string builder
		                resultBuilder.append(reverseString + " ");
		            }
		        }

		        //return the stringbuilder object
		        return resultBuilder.toString();
		    }


		    /**
		     * main method for this class
		     */
		    public static void main(String[] args) {

		        //create a scanner class
		        Scanner Scanner = new Scanner(System.in);

		        //string variable to save the user input string
		        String userInputString;

		        print("Enter a String : ");
		        userInputString = Scanner.nextLine();

		        String result = reverseWordsInString(userInputString);

		        print("Result String is "+result);
		    }
		}


		// TODO Auto-generated method stub

	}

}
