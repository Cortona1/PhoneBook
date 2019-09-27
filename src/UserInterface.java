import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private PhoneBook phoneBook;
    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.phoneBook = new PhoneBook();
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
                searchForANumber();
            } else if(userInput.equals("3")){
                searchForPersonByPhoneNum();
            } else if(userInput.equals("4")){
                addAnAddress();
            } else if(userInput.equals("5")){
                searchForPersonalInfo();
            } else if(userInput.equals("6")){
                removeAPersonsInfo();
            } else if(userInput.equals("7")){
                filteredSearchByKeyword();
            }
        }
    }

    public void addANumber(){
        System.out.print("whose number: ");
        String userInput = this.reader.nextLine();
        System.out.print("number: ");
        String userNumber = this.reader.nextLine();

        this.phoneBook.addANumber(userInput, userNumber);
        System.out.println("");
    }

    public void searchForANumber() {
        System.out.print("whose number: ");
        String userInput = this.reader.nextLine();
        this.phoneBook.searchByPerson(userInput);
    }

    public void searchForPersonByPhoneNum(){
        System.out.print("number: ");
        String userInput = this.reader.nextLine();
        String name = this.phoneBook.searchByNumber(userInput);
        System.out.println(" " + name + "\n");

    }

    public void addAnAddress(){
        System.out.print("whose address: ");
        String userName = this.reader.nextLine();
        System.out.print("street: ");
        String userStreet = this.reader.nextLine();
        System.out.print("city: ");
        String userCity = this.reader.nextLine();
        this.phoneBook.addAnAddress(userName,userStreet, userCity);
        System.out.println("");
    }

    public void searchForPersonalInfo() {
        System.out.print("whose information: ");
        String userName = this.reader.nextLine();
        this.phoneBook.searchForPersonalInfo(userName);
    }

    public void removeAPersonsInfo() {
        System.out.print("whose information: ");
        String userInput = this.reader.nextLine();
        this.phoneBook.removeAPersonsInfo(userInput);
        System.out.println("");
    }

    public void filteredSearchByKeyword() {
        System.out.print("keyword (if empty, all listed): ");
        String keyword = this.reader.nextLine();
        this.phoneBook.filterdSearch(keyword);
    }
}
