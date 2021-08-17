package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1.23456789; // convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.23456789; // convers�o expl�cita (CAST) uma hora o float trunca e n�o mostra todas as casas decimais
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}
}
