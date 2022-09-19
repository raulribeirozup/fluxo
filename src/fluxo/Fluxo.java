package fluxo;

public class Fluxo {

	public static void main(String[] args) throws CheckedAluraException {
		System.out.println("Início do main");
		try {
			metodo1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() {
		System.out.println("Início do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Início do metodo2");
		for(int i = 1; i <= 5; i++) System.out.println(i);
		System.out.println("Fim do metodo2");
		throw new AluraException("null");
	}

}
