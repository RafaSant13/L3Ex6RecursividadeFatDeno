package controller;

public class FatDenoControle {

	public FatDenoControle() {
		super();
	}
	
	public double S�rie (int N) {
		// Condi��o de parada -> Quando N � igual a 1, pois o primeiro valor da s�rie � 1/1!
		if (N == 1)
		{
			return 1;
		}
		else
		{
			double serie = 1/(double)Fat(N) + S�rie(N-1);
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
