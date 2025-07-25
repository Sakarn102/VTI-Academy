package Exercise_3_2;


public class Test {
	public static void main(String[] args) {
		Car car = new Car("Mazda", "8WD");
		
		Car.Engine engine = car.new Engine("Crysler");
		System.out.println("Name: " + car.name);
		System.out.println("type: " + car.type);
		System.out.println("Engine Type: " +engine.getEngineType());
	}
}
