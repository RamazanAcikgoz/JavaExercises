package constructorExample;

public class Main {
    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of eclipse as setters wont be needed
    // test and confirm it works.
    public static void main(String[] args) {

        VipCustomer person = new VipCustomer();
        VipCustomer personTwo = new VipCustomer("Docha", 500);
        VipCustomer personThree = new VipCustomer("Marta",1500,"Kniaznina");

        System.out.println("Customer Name : " + person.getName());
        System.out.println("Customer Limit : " + person.getLimit() + " Customer Address : " + person.getAddress());

        System.out.println("Customer Name : " + personTwo.getName());
        System.out.println("Customer Limit : " + personTwo.getLimit() + " Customer Address : " + personTwo.getAddress());

        System.out.println("Customer Name : " + personThree.getName());
        System.out.println("Customer Limit : " + personThree.getLimit() + " Customer Address : " + personThree.getAddress());
    }

}
