/**
 * Created by dam on 10/10/16.
 */
public class Encostipat implements capturable{
    private String nombre;

    public Encostipat(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Encostipat{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean capturar() {
        double resultado;
        resultado = Math.random()*100;
        if (resultado>42)
            return true;
        else
            return false;
    }

    @Override
    public String info() {
        return this.getNombre();
    }
}
