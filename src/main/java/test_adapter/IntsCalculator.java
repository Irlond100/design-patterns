package test_adapter;

public class IntsCalculator implements Ints {
	
	protected final Calculator target;
	
	public IntsCalculator() {
		this.target = new Calculator();
	}
	
	@Override
	public int sum(int arg0, int arg1) {
		double solution = target.newFormula()
			.addOperand(arg0)
			.addOperand(arg1)
			.calculate(Calculator.Operation.SUM)
			.result();
		return (int) solution;
	}
	
	@Override
	public int mult(int arg0, int arg1) {
		double solution = target.newFormula()
			.addOperand(arg0)
			.addOperand(arg1)
			.calculate(Calculator.Operation.MULT)
			.result();
		return (int) solution;
	}
	
	@Override
	public int pow(int a, int b) {
		double solution = target.newFormula()
			.addOperand(a)
			.addOperand(b)
			.calculate(Calculator.Operation.POW)
			.result();
		return (int) solution;
	}
	
}