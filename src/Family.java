public abstract class Family implements Location {
    private String name;
    private String location;
    private int price;

    public Family(String name, String location, int price) {
        this.name = name;
        this.location = location;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Family { " +
                "name: " + name + '\'' +
                ", location: " + location + '\'' +
                ", price: " + price +
                '}';
    }

    @Override
    public int hotel() {
        return (price * 2)*30;
    }

    @Override
    public int apartment() {
        return price * 3;
    }

    @Override
    public int home() {
        return price * 5;
    }
}
