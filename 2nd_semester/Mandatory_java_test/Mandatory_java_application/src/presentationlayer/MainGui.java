package presentationlayer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainGui implements ActionListener
{
	JFrame frame = new JFrame("Hotel Administration");
	JButton btnBook;
	JTextArea ta;

	public MainGui() throws SQLException
	{
		frame.setSize(1200, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());

		// NORTH - JComboBox
		// JComboBox takes an Object Array as parameter.
		// The Object Array contains what you see in the drop down List
		// You need to get the hotel information in the hotelArr instead of the
		// strings "Test" ... etc
		Object[] hotelArr = { "Test", "Test1", "Test2", "Test3", "Test4" };
		@SuppressWarnings({ "rawtypes", "unchecked" })
		// this just hide some unimportant warnings
		JComboBox hotelList = new JComboBox(hotelArr);
		hotelList.addActionListener(this);
		frame.add(hotelList, BorderLayout.NORTH);

		// CENTER - TextArea
		ta = new JTextArea();
		frame.add(ta, BorderLayout.CENTER);

		// SOUTH - Button
		btnBook = new JButton("Register new Guest in the System");
		frame.add(btnBook, BorderLayout.SOUTH);
		btnBook.addActionListener(this);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

	}

	public static void main(String[] args) throws SQLException
	{
		new MainGui();
	}

}
