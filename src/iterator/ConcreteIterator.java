package iterator;

public class ConcreteIterator<T> extends Iterator<T> {
	
	private ConcreteAggregate<T> aggr;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate<T> aggr) {
		this.aggr = aggr;
	}

	@Override
	public boolean hasNext() {
		return current < aggr.getLength() ? true : false;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		current++;
		return aggr.get(current - 1);
	}

}
