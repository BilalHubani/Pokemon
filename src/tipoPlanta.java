/**
 * Created by dam on 3/10/16.
 */
public class tipoPlanta extends Pokemon implements capturable{
    private String tipo = "Planta";
    private String fuerte = "Agua";
    private String debil = "Fuego";

    public tipoPlanta(String nombre, int atk, int def, int ps) {
        super(nombre, atk, def, ps);
        this.tipo = "Planta";
        this.fuerte = "Agua";
        this.debil = "Fuego";
    }

    @Override
    public String toString() {
        return super.toString() + " tipoPlanta{" +
                "tipo='" + tipo + '\'' +
                ", fuerte='" + fuerte + '\'' +
                ", debil='" + debil + '\'' +
                "} " ;
    }

    @Override
    public boolean capturar() {
        double random1;
        double random2;
        random1 = (this.getPs()*Math.random()*255*4)/(this.getDef()*5);
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
