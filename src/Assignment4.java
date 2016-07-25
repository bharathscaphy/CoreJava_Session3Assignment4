import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculator");
		System.out.println("Enter First Number:");
		double a=sc.nextDouble();
		System.out.println("Enter Second Number:");
		double b=sc.nextDouble();
		System.out.println("Enter the Operator:");
		String c=sc.next();
		Calculator c1=new Calculator();
		double res=c1.cal(a, b, c);
		System.out.println(a+" "+c+" "+b+" = "+res);
		sc.close();
	}

}
