package ejercicios;
import java.util.Scanner;

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle() {
		return title;
	}
}

class MyBook extends Book{
	@Override
	void setTitle(String s) {
		title = s;
	}
}

public class ejercicio2 {
	public String ejercicio2;
	public String getEjercicio2() {
		return this.ejercicio2;
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("El titulo es: " + new_novel.getTitle());
		sc.close();
	}
}
