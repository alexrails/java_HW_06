package academy.belhard;

public class Main {

    public static void main(String[] args) {
	Vehicle car1 = new Car(4, 5, 10200);
	Vehicle car2 = new Car(4, 3, 15600);
	Vehicle motorcycle1 = new Motorcycle(2, 170);
	Vehicle motorcycle2 = new Motorcycle(2, 220);

	car1.printInfo();
	car2.printInfo();

	System.out.println();

	motorcycle1.printInfo();
	motorcycle2.printInfo();

    }
}
