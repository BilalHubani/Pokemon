/**
 * Created by dam on 28/9/16.
 */
public class Pokemon {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public Pokemon(String nombre, int atk, int def, int ps) {
        this.nombre = nombre;
        this.atk = atk;
        this.def = def;
        this.ps = ps;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", atk=" + atk +
                ", def=" + def +
                ", ps=" + ps +
                '}';
    }

    private String nombre;
    private int atk;
    private int def;
    private int ps;
}
