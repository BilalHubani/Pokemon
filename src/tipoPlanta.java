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
        double resultado;
        resultado = Math.random()*100;
        if (resultado>20){

    return true;
        }
        else
            return false;
    }

    @Override
    public String info() {
        return this.getNombre();
    }
}
