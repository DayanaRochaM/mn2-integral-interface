package trab2.NewtonCotes.Model;

public class Cubo extends Funcao{
    @Override
	public double valor(double x) {
		return Math.pow(x, 3);
	}
}
