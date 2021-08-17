package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
	int a = 1;
	int b = 2;
		
	a++; //  a = a + 1; a = 2
	a--; // a = a - 1; a = 1
		
	++b; // b = b + 1; b = 3
	--b; // b = b - 1; b = 2
		
	System.out.println(a);
	System.out.println(b);
	
	System.out.println("Mini desafio...");
	System.out.println(++a == b--); // a = 2, compara com b = 2 e depois subtrai 1 de b, b = 1 
	System.out.println(a);
	System.out.println(b);
	
	
	}
	
}
