import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
		Car car = new Car("bmw", "red", 2.0);

//		System.out.println(car.getBrand());

		car.drive();

		ArrayList<Car> carList = new ArrayList<Car>();

		carList.add(new Car("Opel", "Black", 1.2));
		carList.add(car);

		for (Car car2 : carList)
		{
			System.out.println(car2);
		}

	}

}
