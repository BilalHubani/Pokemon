/**
 * Created by dam on 3/10/16.
 */
public class tipoFuego extends Pokemon implements capturable{
    private String tipo = "Fuego";
    private String fuerte = "Planta";
    private String debil = "Agua";

    public tipoFuego(String nombre, int atk, int def, int ps) {
        super(nombre, atk, def, ps);
        this.tipo = "Fuego";
        this.fuerte = "Planta";
        this.debil = "Agua";
    }

    @Override
    public String toString() {
        return super.toString() + " tipoFuego{" +
                "tipo='" + tipo + '\'' +
                ", fuerte='" + fuerte + '\'' +
                ", debil='" + debil + '\'' +
                "} ";
    }

    @Override
    public boolean capturar() {
        double random1;
        double random2;
        random1 = (this.getPs()*Math.random()*255*4)/(this.getDef()*3);
        random2 = Math.random()*255;
        if (random1>random2)
            return true;
        else
            return false;
    }

    @Override
    public String info() {
        return this.getNombre();
    }
}
