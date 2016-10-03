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
    public boolean capturar() {
        return false;
    }
}
