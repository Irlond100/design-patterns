package tset_SOLID.filter;

import tset_SOLID.Product;

public class AvailableFilter implements Filter {
	//Interface segregation principle
	//все  фильты наследуются от инт. фильтр
	@Override
	public boolean filter(Product product) {
		return product.getCount() > 0;
	}
	
}
