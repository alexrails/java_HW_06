package academy.belhard;

public class Motorcycle extends Vehicle{
    private int maxSpeed;

    public Motorcycle(int wheelCount, int maxSpeed){
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void printInfo() {
        System.out.println("Vehicle: " + getClass().getSimpleName() + "\n" +
                           "Number of wheels: " + this.wheelCount + "\n" +
                           "Maximum speed: " + this.maxSpeed);
    }
}
