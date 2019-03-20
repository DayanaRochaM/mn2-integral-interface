package trab2.NewtonCotes.Model;

public class Quadrado extends Funcao{
    @Override
	public double valor(double x) {
		return Math.pow(x, 2);
	}
}
