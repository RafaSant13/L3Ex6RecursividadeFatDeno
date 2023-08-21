package controller;

public class FatDenoControle {

	public FatDenoControle() {
		super();
	}
	
	public double Série (int N) {
		// Condição de parada -> Quando N é igual a 1, pois o primeiro valor da série é 1/1!
		if (N == 1)
		{
			return 1;
		}
		else
		{
			double serie = 1/(double)Fat(N) + Série(N-1);
			return serie;
		}
	}
	
	public int Fat(int N) {
		if (N<2)
		{
			return 1;
		}
		else
		{
			int fatorial = N * Fat((N-1));
			return fatorial;
		}
	}

}
