package tset_SOLID;

import tset_SOLID.filter.Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shop {
	//Single-responsibility principle
	//Магазин отдельно, но работает все через него.
	private final String name;
	private final List<Product> products = new ArrayList<>();
	
	public Shop(String name) {
		this.name = name;
	}
	
	public void showFiltered(Filter... filters) {
		products.forEach(product ->
			{
				boolean isOk = true;
				for (Filter filter : filters) {
					if (!filter.filter(product)) {
						isOk = false;
						break;
					}
				}
				if (isOk) {
					System.out.println(product);
				}
			}
		);
	}
	
	public void addProducts(Product... products) {
		this.products.addAll(Arrays.asList(products));
	}
	
}