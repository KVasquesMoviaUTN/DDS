package QMP;

import static java.util.Objects.requireNonNull;

public class Prenda {
    TipoDePrenda tipoDePrenda;
    Material material;
    Color color;

    Color colorSecundario;


    public Prenda(TipoDePrenda tipoDePrenda, Material material, Color color) {
        this.tipoDePrenda = requireNonNull(tipoDePrenda, "tipo de prenda es obligatorio");
        this.material = requireNonNull(material, "material es obligatorio");
        this.color = requireNonNull(color, "color es obligatorio");
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }
}
