package tset_iterator;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
	
	protected Random random;
	int min;
	int max;
	
	
	public Randoms(int min, int max) {
		random = new Random();
		this.min = min;
		this.max = max+1;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<>(){
			
			@Override
			public boolean hasNext() {
				return true;
			}
			
			@Override
			public Integer next() {
				return random.ints(min, max)
					.findFirst()
					.getAsInt();
			}
		};
	}
	
	
}