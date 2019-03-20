package trab2.Controller;

import trab2.NewtonCotes.Model.Cos;
import trab2.NewtonCotes.Model.Cubo;
import trab2.NewtonCotes.Model.Funcao;
import trab2.NewtonCotes.Model.NewtonCotes;
import trab2.NewtonCotes.Model.Quadrado;
import trab2.NewtonCotes.Model.Sen;

public class MainController {
    
    public double calcularIntegralNewton (String funcao, double a, double b, int p, double E, boolean opcao){
    
        NewtonCotes n = new NewtonCotes();
        Funcao f = new Quadrado();
        switch(funcao){
            case "Quadrado":
                f = new Quadrado();
                break;
                
            case "Cubo":
                f = new Cubo();
                break;
                
            case "Seno":
                f = new Sen();
                break;
                
            case "Cosseno":
                f = new Cos();
                break;
            
            default:
                System.out.println("Esta opção não é válida!");
        }
        
        return  n.Calcular(f, a, b, p, E, opcao);
    }
    
}
