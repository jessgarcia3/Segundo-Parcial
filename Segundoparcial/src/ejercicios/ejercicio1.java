package ejercicios;
import java.util.Scanner;
		
interface AdvancedArithmetic{
	int divisor_sum(int n);
}
		
class MyCalculator implements AdvancedArithmetic{
	public int divisor_sum(int n) {
		int sum = 0;
		int sqrt = (int) Math.sqrt(n);
		for (int i = 1; i <= sqrt; i++) {
			// el divisor
	           if (n % i == 0) {
	               sum += i + n/i;
	           }
		}
		if (sqrt * sqrt == n) {
			sum -= sqrt;
		}
		return sum;
	}
}

class resolucion{
	public String ejercicio1;
	public String getEjercicio1() {
		return this.ejercicio1;
	}
	public static void main(String []args){
		MyCalculator my_calculator = new MyCalculator();
		System.out.print("I implemented: ");
		ImplementedInterfaceNames(my_calculator);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close(); 
		}

	static void ImplementedInterfaceNames(Object o) {
		@SuppressWarnings("rawtypes")
		Class[] theInterfaces = o.getClass().getInterfaces();
		for (int i = 0; i < theInterfaces.length; i++) {
			String interfaceName = theInterfaces[i].getName();
			System.out.println(interfaceName);
		}
	}	
}

