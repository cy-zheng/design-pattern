package iterator;

public abstract class Aggregate<T> {
	
	public abstract Iterator<T> getIterator();
	public abstract T get(int index);
	public abstract int getLength();
	public abstract void add(T e);
	public abstract void remove(T e);

}
