public class Car 
{
	// fields
	private String brand;
	private String color;
	private double cc;

	// Metoder
	public Car(String brand, String color, double cc)
	{
		this.setBrand(brand);
		this.setColor(color);
		this.setCc(cc);
	}

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public double getCc()
	{
		return cc;
	}

	public void setCc(double cc)
	{
		this.cc = cc;
	}
	
	public void drive()
	{
//		for (int i = 50; i >= 0; i--)
//		{
//			System.out.println(i);
//		}
	}
	@Override
	public String toString()
	{
		return brand + ", " + color + ", " + cc;
		//return "Hello";
	}

}
