package QMP;

import static QMP.Categoria.*;
import static QMP.Material.*;
import static QMP.Trama.*;

public class Main {
    public static void main(String args[]){
        Color rojo = new Color(255,0,0);
        TipoDePrenda zapato = new TipoDePrenda(CALZADO);
        Materiales cueroLisoRojo = new Materiales(CUERO,LISA,rojo);

        System.out.println("Prueba: ");

        Prenda unaPrenda = new Prenda(zapato, CUERO, rojo, null, ESTAMPADO);
        Prenda otraPrenda = new Prenda(zapato, cueroLisoRojo, null);//ITERACION 2

        System.out.println("tonalidad de rojo: " + unaPrenda.color);
        System.out.println("tipoDePrenda: " + unaPrenda.tipoDePrenda);
        System.out.println("material: " + unaPrenda.material);
    }
}