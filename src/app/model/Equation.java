package app.model;

public class Equation {
	private String type; 
	private double value1;
	private double valeu2;
	private double result;
	
	public Equation(){}
	
	public Equation(String t, double v1, double v2){
		this.setType(t);
		this.setValue1(v1);
		this.setValeu2(v2);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getValue1() {
		return value1;
	}

	public void setValue1(double value1) {
		this.value1 = value1;
	}

	public double getValeu2() {
		return valeu2;
	}

	public void setValeu2(double valeu2) {
		this.valeu2 = valeu2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public void addition(double v1, double v2){
		this.setResult(v1+v2);
	}
	
	public void subtraction(double v1, double v2){
		this.setResult(v2-v1);	
	}
	
	public void division(double v1, double v2){
		this.setResult(v1/v2);
	}
	
	public void multiplication(double v1, double v2){
		this.setResult(v1*v2);
	}
}
