
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PhoneBook {
    private List<Person> phoneBook;
    private List<String> listOfNames;

    public PhoneBook(){
        this.phoneBook = new ArrayList<Person>();
        this.listOfNames = new ArrayList<String>();
    }

    public void addANumber(String name, String number){
        if(!this.listOfNames.contains(name)){
            Person person = new Person(name);
            person.addPhoneNumber(number);
            this.phoneBook.add(person);
            this.listOfNames.add(name);
        } else {
            for (Person person : this.phoneBook) {
                if (person.getName().equals(name)) {
                    person.addPhoneNumber(number);
                }
            }
        }

    }

    public void searchByPerson(String name){
        if(!this.listOfNames.contains(name)) {
            System.out.println(" not found\n");
        } else {
            for (Person person : this.phoneBook) {
                if(person.getName().equals(name)){
                    System.out.println(person.getJustNumbers());
                }
            }
        }
    }

    public String searchByNumber(String phoneNumber){
        for (Person person : this.phoneBook) {
            if (person.getJustNumbers().contains(phoneNumber)) {
                return " " + person.getName();
            }
        } return " not found";
    }

    public void addAnAddress(String name, String street, String city) {
        if(!this.listOfNames.contains(name)) {
            Person person = new Person(name);
            this.listOfNames.add(name);
            this.phoneBook.add(person);
        }
        for (Person person : this.phoneBook) {
            if (person.getName().equals(name)) {
                person.addAddress(street + " " + city);
            }
        }
    }

    public void searchForPersonalInfo(String name) {
        if (!this.listOfNames.contains(name)){
            System.out.println("  not found");

        } else {
            for(Person person: this.phoneBook) {

                if (person.getName().equals(name) && person.getAddress().equals("")){

                    System.out.println("  address unknown");
                    System.out.print("  phone numbers: \n " + person.getJustNumbersVar()
                            + "\n");
                    break;
                } else {
                    System.out.println("  address: " + person.getAddress());
                    System.out.print("  phone number: \n " + person.getJustNumbersVar()
                            + "\n");
                }
            }
        }
    }

    public void removeAPersonsInfo(String name) {
        List<Person> toRemove = new ArrayList<Person>();
        for (Person person : this.phoneBook) {
            if (person.getName().equals(name)) {
                toRemove.add(person);

            }
        }
        this.phoneBook.removeAll(toRemove);
        this.listOfNames.remove(name);
    }

    public void filterdSearch(String keyword) {
        List<Person> filteredPersons = new ArrayList<Person>();
        Collections.sort(this.phoneBook);

        for (Person person : this.phoneBook) {

            if (person.getName().contains(keyword) || person.getAddress().contains(keyword)) {
                filteredPersons.add(person);
            }
        }
        if (filteredPersons.isEmpty()) {
            System.out.println(" keyword not found");


        }
        if (!filteredPersons.isEmpty()) {
            filteredSearchResults(filteredPersons);
        }
    }


    public void filteredSearchResults(List<Person> listPersons) {
        for(Person person: listPersons) {

            if (person.getAddress().equals("")){
                System.out.println(" " + person.getName());
                System.out.println("  address unknown");
                System.out.print("  phone numbers: \n " + person.getJustNumbersVar()
                        + "\n");

            } else {
                System.out.println(" " + person.getName());
                System.out.println("  address: " + person.getAddress());
                System.out.print("  phone number: \n " + person.getJustNumbersVar()
                        + "\n");
            }
        }
    }

}
