package dat14V1;

import java.util.ArrayList;

public class Main
{

	public static void main(String[] args)
	{
		Square s = new Square();
		Triangle t = new Triangle();
		
		Shape sh = new Square();
		Shape sha = new Triangle();
		
		ArrayList<Square> listSquare = new ArrayList<Square>();
		
		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(new Square());
		list.add(new Triangle());
		
		for (Shape shape : list)
		{
			shape.area();
		}
		
	}

}
