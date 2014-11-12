package Dat14V1.precentationlayer;

import java.sql.SQLException;
import java.util.Scanner;

import Dat14V1.applicationlayer.HotelApp;
import Dat14V1.applicationlayer.datatypes.Hotel;

public class Main
{

	public static void main(String[] args) throws SQLException
	{
		@SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
		HotelApp hotel = new HotelApp();

		System.out.print("What hotel do you want to see? ");
		int i = console.nextInt();

		Hotel h = hotel.getHotel(i);

		System.out.println("hotelNo\t\thotelName\t\tcity");
		System.out.println("****************************************************");
		System.out.println(h.getHotelNo() + "\t\t" + h.getHotelName() + "\t\t" + h.getCity());

	}

}
