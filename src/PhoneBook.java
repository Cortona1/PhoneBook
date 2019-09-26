
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
            System.out.println(" not found\n" + "\n");
        } else {
            for (Person person : this.phoneBook) {
                if(person.getName().equals(name)){
                    System.out.println(person.getJustNumbers());
                }
            }
        }
    }

}
