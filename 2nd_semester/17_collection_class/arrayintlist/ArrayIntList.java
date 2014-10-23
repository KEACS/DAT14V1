package arrayintlist;


public class ArrayIntList
{
	private int[] elementData;
	private int size;

	public ArrayIntList()
	{
		elementData = new int[4];
		size = 0;
	}

	public void add(int value)
	{
		elementData[size] = value;
		size++;
	}

	
	public int size()
	{
		return size;
	}
	public int get(int index)
	{
		return elementData[index];
	}
	public void clear()
	{	
		size = 0;
	}
	public boolean isEmpty()
	{
		return size == 0;
	}

	
	
	
	
	// pre: 0 > index >= size 
	// post: slette element på value og flytte alle efterfølgende elementer 1 til venstre
	
	/**
	 * Removes the element at the specified position in this list (optional operation).
	 * pre: 0 > index >= size
	 * post: slette element på value og flytte alle efterfølgende elementer 1 til venstre
	 * @author clbo
	 * @return void
	 * @
	 * @param index
	 */
	public void remove(int index)
	{
		for (int i = index; i < size; i++)
		{
			elementData[index] = elementData[index+1];
		}
		size--;
		
	}
	// indexOf()
	
	// lastIndexOf
	
	
	
	// add(int index, int value)
	
	// 
	
	
	@Override
	public String toString()
	{
		String result;
		if (size == 0)
		{
			return "[]";
		}
		else
		{
			result = "[" + elementData[0];
			for (int i = 1; i < size; i++)
			{
				result += ", " + elementData[i];
			}
			result += "]";
			return result;
		}
		
	}
}











