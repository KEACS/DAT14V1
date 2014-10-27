package arrayintclass.examplefinnished;

public class ArrayIntList
{
	public int[] elementData;
	private int size;

	public static final int DEFAULT_CAPACITY = 100;

	public ArrayIntList()
	{
		this(DEFAULT_CAPACITY);
	}

	public ArrayIntList(int capacity)
	{
		elementData = new int[capacity];
		size = 0;
	}

	public int size()
	{
		return size;
	}

	public int get(int index)
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

	public int indexOf(int value)
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

	public void add(int value)
	{
		elementData[size] = value;
		size++;
	}

	public void add(int index, int value)
	{
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
