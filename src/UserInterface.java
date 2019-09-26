import java.util.Scanner;

public class UserInterface {
    private Scanner reader;

    public UserInterface(Scanner reader) {
        this.reader = reader;

    }

    public void start() {
        introduction();

    }

    public void introduction() {
        System.out.println("Phone Search\navailable operations: \n 1 add"
                + " a number\n 2 search for a number\n 3 search for a person by"
                + " phone number\n 4 add an address\n 5 search for personal"
                + " information\n 6 delete personal information\n 7 filtered"
                + " listing\n x quit\n");
    }

}
