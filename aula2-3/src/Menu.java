import java.util.Scanner;

public class Menu {
	
	public static boolean etriangulo=false;
	
public static void main(String[] args) {
		System.out.println("Bem vindo ao menu de instruções, escolha uma das opções");
		System.out.println("Digite 1 para verificar se os valores formam um triângulo");
		System.out.println("Digite 2 para cálculo de área e perimetro de triângulos retângulos ou retângulos, ou 3 para fechar o programa");
		Scanner ler1 = new Scanner(System.in);
		 int option = ler1.nextInt();
		
		 if(option==1) {
			 System.out.println("digite os 3 valores dos possíveis lados");
			 Scanner ler = new Scanner(System.in);
			 
				int a = ler.nextInt();
				int b = ler.nextInt();
				int c = ler.nextInt();
				e_triangulo(a,b,c);
			 
		 }
		if(option==2) {
			
			System.out.println("Primeiro digite os 2 lados e em seguida :digite triangulo ou retangulo");
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
		
		
	}
	
	public static void e_triangulo(int aa, int bb, int cc) {
		
		if((bb-cc<aa && bb+cc>aa)&& (aa-cc<bb && aa+cc>bb) &&(aa-bb<cc && aa+bb>cc) ){
			etriangulo=true;
			System.out.println("é triangulo");
		
	}
		else {
			System.out.println("não é triangulo");
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
