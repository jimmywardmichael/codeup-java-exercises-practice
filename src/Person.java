import java.lang.String;
public class Person {

    public String firstName;
    public String lastName;

    public String sayHello(){
        return  String.format("Hello from %s %s!", firstName, lastName);
    }

    public static void main(String[] args) {
        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Stanchez";
        System.out.println(rick.sayHello());
        //prints hello from rick stanchez
    }
}
