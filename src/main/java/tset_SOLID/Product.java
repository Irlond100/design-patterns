package tset_SOLID;


public class Product {
	
	private String name;
	private String producer;
	private double price;
	private int count;
	
	public Product(String name, String producer, double price, int count) {
		this.name = name;
		this.producer = producer;
		this.price = price;
		this.count = count;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getProducer() {
		return producer;
	}
	
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Product{" +
			"name='" + name + '\'' +
			", producer='" + producer + '\'' +
			", price=" + price +
			", count=" + count +
			'}';
	}
	
}
