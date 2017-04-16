package iterator;

public class IteratorDemo {
	
	public static void main(String[] args) {
		Aggregate<Integer> aggregate = new ConcreteAggregate<>();
		for(int i = 0; i < 10; i++){
			aggregate.add(i);
		}
		Iterator<Integer> iterator = aggregate.getIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
