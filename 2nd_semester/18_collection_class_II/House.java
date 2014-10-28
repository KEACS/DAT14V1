package dat14v1;

public class House<T>
{
	T p;
	
	@SuppressWarnings("unchecked")
	public void add(T p)
	{
		this.p = (T) new Object();
	}
	public T remove(T p)
	{
		return p;
	}

}
