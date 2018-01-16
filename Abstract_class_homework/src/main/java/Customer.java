public abstract class Customer {
    private String name;
    private int height;
    private int age;
    private Double money;

    public Customer(String name, int age, int height, Double money){
        this.name = name;
        this.age = age;
        this.height = height;
        this.money = money;
    }
}
