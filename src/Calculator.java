
public class Calculator {
	public double cal(double val1,double val2,String op)
	{
		double result=0;
		switch(op)
		{
		case "+":
			result = val1+val2;
			break;
		case "-":
			result = val1-val2;
			break;
		case "*":
			result = val1*val2;
			break;
		case "/":
			result = val1/val2;
			break;
		default:
			System.out.println("Invalid Operator");
		}
		return result;
	}
}
