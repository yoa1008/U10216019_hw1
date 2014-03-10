
import java.util.*;
public class Main {
	public static void main(String arg[]) {
		methodA a = new methodA();
		methodB b = new methodB();
		methodC c = new methodC();
		methodD d = new methodD();
		methodE e = new methodE();
		methodF f = new methodF();
		methodG g = new methodG();

		Scanner in = new Scanner(System.in);
		


		System.out.println("Please enter a number to compute x*x ");
		double num1 = in.nextDouble();
		System.out.println("The result of x*x is " + a.f(num1));
		
		System.out.println("Please enter a number to compute sin(x) ");
		double num2 = in.nextDouble();
		System.out.println("The result of sin(x) is " + b.f(num2));
		
		System.out.println("Please enter a number to compute cos(x) ");
		double num3 = in.nextDouble();
		System.out.println("The result of cos(x) is " + c.f(num3));
		
		System.out.println("Please enter a number to compute tan(x) ");
		double num4 = in.nextDouble();
		System.out.println("The result of tan(x) is " + d.f(num4));
		
		System.out.println("Please enter a number to cos(x) + 5sin(x) ");
		double num5 = in.nextDouble();
		System.out.println("The result of cos(x) + 5sin(x) is " + e.f(num5));
		
		System.out.println("Please enter a number to compute 5cos(x) + sin(x) ");
		double num6 = in.nextDouble();
		System.out.println("The result of 5cos(x) + sin(x) is " + f.f(num6));
		
		System.out.println("Please enter a number to compute log(x) + x*x ");
		double num7 = in.nextDouble();
		System.out.println("The result of log(x) + x * x is " + g.f(num7));
	}
}
