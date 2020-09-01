import java.util.Scanner;
public class Triangulo {
	
	public static Scanner ler = new Scanner(System.in);
	public  static boolean etriangulo=false;
	public static int a = ler.nextInt();
	public static int b = ler.nextInt();
	public static int c = ler.nextInt();
	
	
	public static void main(String[] args) {
	e_triangulo(a,b,c);
	
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

}