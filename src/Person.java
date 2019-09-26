import java.util.ArrayList;
import java.util.List;

public class Person {
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


}
