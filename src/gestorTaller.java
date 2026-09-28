/** Clase gestor solicitada en la planificacion de clases y detallada ene l punto 5.
 *  La clase establece la lista para almacenar las Bicicletas y las gestiona con 2 metodos.
 */
import java.util.ArrayList;
public class gestorTaller {
    //  ● Importada la libreria correspondiente se declara el ArrayList que almacenara la Bicicletas.
    public ArrayList<Bicicleta> bicicletas;
    //  ● Declaramos el constructor de la clase para poder instanciarla desde el main y usar sus metodos.
    public gestorTaller(){
        bicicletas = new ArrayList<>();
    }
    //  ● Metodo para registrar/agregar las Bicicletas en el ArrayList y notificar si esta ok.
    public void registroBicicleta (Bicicleta bicicleta){
        bicicletas.add(bicicleta);
        System.out.println("La bicicleta fue registrada exitosamente");
    }
    //  ● Metodo busca Bicicletas por codigo en el ArrayList y almacena los resultados en una nueva lista que entrega como respuesta.
    public ArrayList<Bicicleta> buscarBicicleta(String codigoBuscado){
        ArrayList<Bicicleta> listaBicicletas = new ArrayList<>();
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getCodigoBicicleta().equals(codigoBuscado)) {
                listaBicicletas.add(bicicleta);
            }
        }
        return listaBicicletas;
    }

}

