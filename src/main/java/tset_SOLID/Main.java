package tset_SOLID;

import tset_SOLID.filter.AvailableFilter;
import tset_SOLID.filter.MaxPriceFilter;

public class Main {
	
	public static void main(String[] args) {
		var shop = new Shop("Магнит");
		var product1 = new Product("Молоко", "Простоквашино", 80, 100);
		var product2 = new Product("Туалетная бумага", "Zeva", 120, 1000);
		var product3 = new Product("Водка 0.5", "Absolute", 1000, 5);
		var product4 = new Product("Водка 0.5", "Архангельская", 340, 0);
		shop.addProducts(product1, product2, product3, product4);
		
		// Проверка
		shop.showFiltered(
			new AvailableFilter(),
			new MaxPriceFilter(500),
			(product -> product.getPrice() >= 100));
	}
	
}
