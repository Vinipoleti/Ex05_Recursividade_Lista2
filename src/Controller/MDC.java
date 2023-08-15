package Controller;

public class MDC {

	public MDC() {
		super ();
	}
	
	public int CalculoMDC (int a, int b) {
		if (a>b) {
			return CalculoMDC(a-b,b); // a sendo maior que b, vamos subtrair e retornar na função, para inverter a entrada e subtrair novamente
		} else {
			if (a==b) { // chegando na igualdade, temos finalmente o resultado
			return a; // retornando a
		} else {
			return CalculoMDC(b,a); // inverte para entrar na primeira condição
		}
			
	}
}
}