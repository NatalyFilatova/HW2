
public class Candy extends Food {
    public double getPrice (int date) {
        return 180 - date;
    }
    public double getWeight (int date) {
        return 400 - date;
    }
    public String toString (){
        return String.valueOf(sum(180, 400));
    }

    public static void main(String [] args){
        Candy candy = new Candy();
        candy.setName ("Raffaello");
        candy.setWeight(400);
        candy.setPrice(180);
        System.out.println("Стоимость "+ candy.name +  " за " + candy.weight + " грамм " + candy.toString() );

    }

}
