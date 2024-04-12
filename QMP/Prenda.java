package QMP;


public class Prenda {
    TipoDePrenda tipoDePrenda;
    Material material;
    Color color;

    Color colorSecundario;


    public Prenda(TipoDePrenda tipoDePrenda, Material material, Color color) {
        this.tipoDePrenda = tipoDePrenda;
        this.material = material;
        this.color = color;
    }
}
