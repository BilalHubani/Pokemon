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
    public boolean capturar() {
        double resultado;
        resultado = Math.random()*100;
        if (resultado>50)
            return true;
        else
            return false;
    }
}
