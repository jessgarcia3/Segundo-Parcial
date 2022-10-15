package ejercicios;

class Aritmetic {
	int add (int a, int b) {
		return a + b;
	}
}

class Adder extends Aritmetic{	
}

public class ejercicio3 {
	public String ejercicio3;
	public String getEjercicio3() {
		return this.ejercicio3;
	}
		public static void main(String []args) {
			Adder a = new Adder();
			System.out.println("Mi superclase es: " +a.getClass().getSuperclass().getName());
			System.out.print(a.add(10, 32) + "" + a.add(10, 3)+ ""+ a.add(10, 10)+ "\n");	
	}
}
