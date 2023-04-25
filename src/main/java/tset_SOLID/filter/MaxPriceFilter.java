package tset_SOLID.filter;

import tset_SOLID.Product;

public class MaxPriceFilter implements Filter {
	
	private double maxPrice;
	
	public MaxPriceFilter(double maxPrice) {
		this.maxPrice = maxPrice;
	}
	// Dependency inversion principle
	
	@Override
	public boolean filter(Product product) {
		return product.getPrice() <= maxPrice;
	}
	
}
