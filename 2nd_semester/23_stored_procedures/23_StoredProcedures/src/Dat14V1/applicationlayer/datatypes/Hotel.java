package Dat14V1.applicationlayer.datatypes;

public class Hotel
{
	private int hotelNo;
	private String hotelName;
	private String city;

	public Hotel(int hotelNo, String hotelName, String city)
	{
		this.hotelNo = hotelNo;
		this.hotelName = hotelName;
		this.city = city;
	}

	public int getHotelNo()
	{
		return hotelNo;
	}

	public void setHotelNo(int hotelNo)
	{
		this.hotelNo = hotelNo;
	}

	public String getHotelName()
	{
		return hotelName;
	}

	public void setHotelName(String hotelName)
	{
		this.hotelName = hotelName;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}
	@Override
	public String toString()
	{
		return /*this.hotelNo + ", " + */this.hotelName/* + ", " + this.city*/;
	}

}
