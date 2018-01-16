public abstract class Ride {
    private int minAge;
    private int minHeight;
    private Double price;
    private int capacity;

    public Ride(int minAge, int minHeight, Double price, int capacity){
        this.minAge = minAge;
        this.minHeight = minHeight;
        this.price = price;
        this.capacity = capacity;
    }
}
