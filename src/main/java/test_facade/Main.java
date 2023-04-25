package test_facade;

public class Main {
	public static void main(String[] args) {
		BinOps bins = new BinOps();
		System.out.println(Integer.parseInt("0100", 2));
		System.out.println(Integer.parseInt("0011", 2));
		System.out.println("Сумма: "+bins.sum("0100","0011"));
		System.out.println("Умножение: "+bins.mult("0100","0011"));
		
	}
}
