package list;


public class Stack {
	
	public static void main(String[] args) {
		String[] manishPattern = {
                "*    *","*                    *",
                "**  **","* *                * *",
                "* ** *","*   *             *  *",
                "*    *","*    *          *    *",
                "*    *","*      *      *      *",
                "*    *","*        *  *        *",
                "*    *","*          *         *",
        };

        // Print each line of the pattern
        for (String line : manishPattern) {
            System.out.println(line);
        }
		
		
	}
	
}