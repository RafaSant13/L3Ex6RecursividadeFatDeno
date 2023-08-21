package view;
import controller.FatDenoControle;

public class Principal {

	public static void main(String[] args) {
		FatDenoControle FC = new FatDenoControle();
		int N = 3;
		
		System.out.println("A soma da série é: "+FC.Série(N));

	}

}
