package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> extends Aggregate<T> {
	
	private List<T> list = new ArrayList<>();
	
	@Override
	public int getLength(){
		return list.size();
	}
	
	@Override
	public void add(T item) {
		list.add(item);
	}
	
	@Override
	public void remove(T item) {
		list.remove(item);
	}
	
	@Override
	public T get(int index){
		return list.get(index);
	}

	@Override
	public Iterator<T> getIterator() {
		return new ConcreteIterator<T>(this);
	}

}
