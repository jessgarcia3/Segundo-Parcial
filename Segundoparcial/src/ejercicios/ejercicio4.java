package ejercicios;

class Animal{
	void walk() {
		System.out.println("Estoy caminando");		
	}
}

class Bird extends Animal{
	void fly() {
		System.out.println("Estoy volando");
		}
	void sing() {
		System.out.println("Estoy cantando");
		}
}

public class ejercicio4{
	public String ejercicio4;
	public String getEjercicio4() {
		return this.ejercicio4;
	}
	public static void main (String args[]) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}

