package QMP;

import static QMP.Categoria.*;
import static QMP.Material.*;

public class Main {
    public static void main(String args[]){
        Color color = new Color(255,0,100);
        System.out.println("Prueba: ");

        Prenda unaPrenda =new Prenda(CALZADO, CUERO, color);

        System.out.println("tonalidad de rojo: " + unaPrenda.color.rojo);
        System.out.println("tipoDePrenda: " + unaPrenda.tipoDePrenda);
        System.out.println("material: " + unaPrenda.material);


    }
}
