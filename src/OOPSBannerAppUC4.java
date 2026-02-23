/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author Rishika Sengupta
 * @version 4
 */

// Extend the user story 3 to further develop the OOPS Banner Application
// by using String arrays to hold banner lines and printing them in a loop.
// This use case improves upon UC3 by using a String array to store banner lines
// and iterating through them with a for-each loop, eliminating hardcoded print
// statements and improving modularity and reusability.

public class OOPSBannerAppUC4 {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Hint:
        // 1. Define a String array with a size equal to the number of lines in the banner
        String[] lines = new String[7];

        // 2. Populate each index of the array with the corresponding banner line using String.join()
        // Note: The example in the hint mistakenly included System.out.println inside the assignment.
        // To store the string in the array, we call String.join() directly.
        lines[0] = String.join(" ", "  ***  ", "  ***  ", " ***** ", "  ***** ");
        lines[1] = String.join(" ", " ** ** ", " ** ** ", " **  ***","***  **");
        lines[2] = String.join(" ", "**   **", "**   **", " **  ***", "** ");
        lines[3] = String.join(" ", "**   **", "**   **", " ***** ", " ***** ");
        lines[4] = String.join(" ", "**   **", "**   **", " ** ", "       **");
        lines[5] = String.join(" ", " ** ** ", " **  **", " ** ", " **   ***");
        lines[6] = String.join(" ", "  ***  ", "  ***  ", " ** ", "   ***** ");

        // 3. Use a for-each loop to iterate through the array and print each line
        // Then use a for-each loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }

    }
}