package dat14v1;

import java.util.Arrays;

public class ArrayList<E>
{
	private E[] elementData;
	private int size;

	public static final int DEFAULT_CAPACITY = 100;

	public ArrayList()
	{
		this(DEFAULT_CAPACITY);
	}

	// pre: capacity > 0
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity)
	{
		if (capacity < 0)
		{
			throw new IllegalArgumentException("capacity: " + capacity);
		}
		elementData = (E[]) new Object[capacity];
		size = 0;
	}

	public int size()
	{
		return size;
	}

	public E get(int index)
	{
		return elementData[index];
	}

	@Override
	public String toString()
	{
		if (size == 0)
		{
			return "[]";
		}
		else
		{
			String result = "[" + elementData[0];
			for (int i = 1; i < size; i++)
			{
				result += "," + elementData[i];
			}
			result += "]";
			return result;
		}
	}

	public int indexOf(E value)
	{
		for (int i = 0; i < size; i++)
		{
			if (elementData[i] == value)
			{
				return i;
			}
		}
		return -1;
	}
	// pre: size <= elementDta.length
	// post: add value to end of the list
	public void add(E value)
	{
		checkCapacity(size + 1);
		elementData[size] = value;
		size++;
	}
	public void ensureCapcity(int capacity)
	{
		if (capacity > elementData.length)
		{
			int newCapacity = elementData.length * 2 + 1;
			if (capacity > newCapacity)
			{
				newCapacity = capacity;
			}
			int[] list = new int[newCapacity];
			elementData = Arrays.copyOf(elementData, newCapacity);
			
			
//			for (int i = 0; i < size; i++)
//			{
//				list[i] = elementData[i];
//			}
//			elementData = list;
			
			
			
			
		}
	}
	
	private void checkCapacity(int capacity)
	{
		if (capacity > elementData.length)
		{
			throw new IllegalStateException("exeeded list capacity");
		}
	}

	public void add(int index, E value)
	{
		checkCapacity(size + 1);
		
		for (int i = size; i >= index + 1; i--)
		{
			elementData[i] = elementData[i - 1];
		}
		elementData[index] = value;
	}

	public void remove(int index)
	{

		for (int i = index; i < size - 1; i++)
		{
			elementData[i] = elementData[i + 1];
		}
		size--;

	}

	public void clear()
	{
		size = 0;
	}

}
