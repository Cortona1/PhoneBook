import java.util.Scanner;

public class UserInterface {
    private Scanner reader;

    public UserInterface(Scanner reader) {
        this.reader = reader;

    }

    public void start() {
        introduction();
        askUser();

    }

    public void introduction() {
        System.out.println("Phone Search\navailable operations: \n 1 add"
                + " a number\n 2 search for a number\n 3 search for a person by"
                + " phone number\n 4 add an address\n 5 search for personal"
                + " information\n 6 delete personal information\n 7 filtered"
                + " listing\n x quit\n");
    }

    public void askUser() {
        while(true) {
            System.out.print("command: ");
            String userInput = this.reader.nextLine();

            if(userInput.equals("x")) {
                break;
            } else if(userInput.equals("1")){
                addANumber();
            } else if(userInput.equals("2")){

            } else if(userInput.equals("3")){

            } else if(userInput.equals("4")){

            } else if(userInput.equals("5")){

            } else if(userInput.equals("6")){

            } else if(userInput.equals("7")){

            }
        }
    }

    public void addANumber(){
        System.out.print("whose number: ");
        String userInput = this.reader.nextLine();
        System.out.print("number: ");
        String userNumber = this.reader.nextLine();

        this.phoneBook.addANumber(userNumber, userInput);
        System.out.println("");
    }

}
