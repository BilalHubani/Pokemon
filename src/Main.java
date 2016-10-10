import java.util.ArrayList;

/**
 * Created by dam on 28/9/16.
 */
public class Main {
    public static void main(String[] args) {
        tipoFuego chandelure = new tipoFuego("Chandelure", 152, 79, 147);
        tipoFuego charizard = new tipoFuego("Charizard", 179, 82, 168);
        tipoAgua vaporeon = new tipoAgua("Vaporeon", 95, 143, 210);
        tipoAgua lapras = new tipoAgua("Lapras", 79, 132, 217);
        tipoPlanta breloom = new tipoPlanta("Breloom", 148, 50, 112);
        tipoPlanta bulbasaur = new tipoPlanta("Bulbasaur", 52, 63, 91);
        Encostipat resfriao = new Encostipat("Resfriao");
        ArrayList<capturable> capturar = new ArrayList<>();
        capturar.add(chandelure);
        capturar.add(charizard);
        capturar.add(vaporeon);
        capturar.add(lapras);
        capturar.add(breloom);
        capturar.add(bulbasaur);
        capturar.add(resfriao);
        for (int i=0; i<capturar.size();i++){
            System.out.println(capturar.get(i));
            if (capturar.get(i).capturar()){
                System.out.println(capturar.get(i).info()+": Capturado");
            }else{
                System.out.println(capturar.get(i).info()+": Fallaste");
            }

        }

    }
}
