import java.util.LinkedList;

class Address{
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;
    Address(String n, String s, String c, String st, String cod){
       name = n;
       street = s;
       city = c;
       state = st;
       code = cod;
       }
       public String toString(){
        return name + "\n" + street + "\n" + city + "\n" + state + "\n" + code;
       }

}

public class MailList {
    public static void main(String[] args) {

        LinkedList<Address> m1 = new LinkedList<>();
        m1.add(new Address(" J. W. West","11 Oak Avenue", "Urbana", "IL", "61853"));
        m1.add(new Address("Sulbha","Rosette streer", "Oma", "Il", "61853"));

        //Display the mailing list

        for(Address element: m1){
            System.out.println(element + "\n");

            System.out.println();
            
        }
    }
}
