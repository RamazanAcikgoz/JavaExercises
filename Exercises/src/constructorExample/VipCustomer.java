package constructorExample;

public class VipCustomer {
    private String name;
    private int limit;
    private String address;

    public VipCustomer() {
        this("Ramazan",2000,"Kniaznina");
        System.out.println("1st Empty Constructor");
    }
    public VipCustomer(String name, int limit) {
        this(name, limit, "Default Address");
        System.out.println("2nd Constructor");
    }
    public VipCustomer(String name, int limit, String address) {
        this.name = name;
        this.limit = limit;
        this.address = address;
        System.out.println("3rd Constructor");
    }
    public String getName() {
        return name;
    }
    public int getLimit() {
        return limit;
    }
    public String getAddress() {
        return address;
    }
}