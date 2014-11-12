package Dat14V1.applicationlayer;

import java.sql.SQLException;

import Dat14V1.applicationlayer.datatypes.Hotel;
import Dat14V1.dataaccesslayer.HotelSQL;

public class HotelApp
{
	Hotel hotel;
	HotelSQL h;
	
	public Hotel getHotel(int hotelNo) throws SQLException
	{
		h = new HotelSQL();
		return h.selectHotel(hotelNo);
	}
}
