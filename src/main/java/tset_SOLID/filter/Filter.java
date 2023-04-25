package tset_SOLID.filter;

import tset_SOLID.Product;

@FunctionalInterface
public interface Filter {
	//Open-closed principle
	boolean filter(Product product);
	
}
