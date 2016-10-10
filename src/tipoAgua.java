/**
 * Created by dam on 3/10/16.
 */
public class tipoAgua extends Pokemon implements capturable{
    private String tipo = "Agua";
    private String fuerte = "Fuego";
    private String debil = "Planta";

    public tipoAgua(String nombre, int atk, int def, int ps) {
        super(nombre, atk, def, ps);
        this.tipo = "Agua";
        this.fuerte = "Fuego";
        this.debil = "Planta";
    }

    @Override
    public String toString() {
        return  super.toString() + " tipoAgua{" +
                "tipo='" + tipo + '\'' +
                ", fuerte='" + fuerte + '\'' +
                ", debil='" + debil + '\'' +
                "} ";
    }

    @Override
    public boolean capturar() {
        double resultado;
        resultado = Math.random()*255;
        if (resultado>30)
            return true;
        else
            return false;
    }

    @Override
    public String info() {
        return this.getNombre();
    }
}