import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person>{
    private String name;
    private String address;
    private List<String> phoneNumbers;

    public Person(String name) {
        this.name = name;
        this.phoneNumbers = new ArrayList<String>();
        this.address = "";
    }

    public void addPhoneNumber(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);

    }

    public void addAddress(String address){
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public String getJustNumbers() {
        Boolean isEmpty = this.phoneNumbers.isEmpty();
        if (isEmpty) {
            return "phone number not found";
        } else {
            String helper = "";
            for (int i = 0; i < this.phoneNumbers.size(); i++){
                if (i == 0){
                    helper+= " ";
                }
                helper += phoneNumbers.get(i) + "\n ";
            }
            return helper;
        }
    }

    public String getJustNumbersVar() {
        Boolean isEmpty = this.phoneNumbers.isEmpty();
        if (isEmpty) {
            return "phone number not found";
        } else {
            String helper = "";
            for (int i = 0; i < this.phoneNumbers.size(); i++) {
                if (i == 0){
                    helper += "  ";
                }
                helper += phoneNumbers.get(i) + "\n   ";
            }
            return helper;
        }
    }
    public String returnPhoneNumbers(){
        Boolean isEmpty = this.phoneNumbers.isEmpty();
        if (isEmpty) {
            return "phone number not found";
        } else {
            String helper = "";
            for (String phoneNumber : this.phoneNumbers) {
                helper += phoneNumber + "\n   ";
            }
            return "  phone numbers:\n   " + helper;
        }
    }

    public String returnAddress(){
        return this.address;
    }

    public String returnName(){
        return this.name;
    }

    @Override
    public int compareTo(Person person) {
        return returnName().compareTo(person.returnName());
    }

}
