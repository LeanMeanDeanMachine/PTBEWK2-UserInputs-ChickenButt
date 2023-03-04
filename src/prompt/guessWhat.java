package prompt;

import java.util.Scanner;

public class guessWhat {

    public static void main(String[] args)  {
// System.in is a standard input stream
        Scanner sc= new Scanner(System.in);
        System.out.print("Guess What? ");
        String what = sc.nextLine();

        if (what.equals("chicken butt")) {
            System.out.println("Yeeaah Boyyy!");
        } else {
            System.out.println("Chicken Butt!");
        } // end of else
    }   // end of main()
}
