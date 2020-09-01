import java.util.Scanner;
import java.lang.Math;
public class Poligono {
	

	public static void main(String[] args) {
		System.out.println("Escolha os lados e em seguida digite triangulo ou retangulo");
		 Scanner ler = new Scanner(System.in);
		 int a = ler.nextInt();
		 int b = ler.nextInt();
		  String tipo = ler.next();
		
		
		if(tipo.equals("triangulo")) {
		areaTriangulo(a,b);
		perimetroTriangulo(a,b);
		}
		
		if(tipo.equals("retangulo")) {
		areaRetangulo(a,b);
		perimetroRetangulo(a,b);
		}
		
	}
	
	public static void areaTriangulo(int a2, int b2) {
			int areaa= (a2*b2)/2;
			System.out.println(areaa);	
	}
	
	public static void areaRetangulo(int a2, int b2) {
			int areaa= a2*b2;
			System.out.println(areaa);
		}
	


public static void perimetroTriangulo(int a2, int b2) {
	int c;
	int d= (int) Math.pow(a2,2);
	int e=(int) Math.pow(b2, 2);
	c= (int) Math.sqrt( d+e);
	int perimetro= a2+b2+c;
	System.out.println(perimetro);	
}

public static void perimetroRetangulo(int a2, int b2) {
	int perimetro= a2+a2+b2+b2;
	System.out.println(perimetro);
}
}
	
	
	
	
	

