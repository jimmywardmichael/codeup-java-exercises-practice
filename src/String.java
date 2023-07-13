public class String {
    Scanner sc = new Scanner(System.in);
System.out.print("Continue? [y/N] ")
    String userInput = sc.next();

    // Don't do this!
    boolean confirmation = userInput == "y";

}
