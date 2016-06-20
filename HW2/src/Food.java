
abstract class Food {
    public String name;
    public double weight;
    public double price;

    public double sum ( double weight, double price)
    {
        double sum = (price / 1000) * weight ;

        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
