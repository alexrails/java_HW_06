package academy.belhard;

public class Car extends Vehicle implements Costable{
    private int doorsCount;
    private int cost;

    public Car(int wheelCount, int doorsCount, int cost){
        super(wheelCount);
        this.doorsCount = doorsCount;
        this.cost = cost;
    }

    @Override
    protected void printInfo(){
        System.out.println("Vehicle: " + getClass().getSimpleName() + "\n" +
                           "Number of doors: " + this.doorsCount + "\n" +
                           "Number of wheels: " + this.wheelCount + "\n" +
                           "Cost: " + getCost());
    }

    @Override
    public int getCost(){
        return this.cost;
    }
}
