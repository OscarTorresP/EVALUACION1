/**
 * Clase main sonde se realizan las instrucciones del punto 6.
 * Lo primero antes de empezar con las instrucciones importamos las librerias que se utilizaran.
 * En este caso solo importaremos lo necesario para trabajar con el ArrayList de Bicicletas.
 */
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
            /*
            *   Creamos un objeto de la clase gestorTaller para cumplir con los requisitos del punto 5:
                ● Registrar una bicicleta en la colección e informar por consola que fue incorporada correctamente.
                ● Buscar y retornar las bicicletas cuyo código coincida con el criterio de búsqueda recibido.
            */
            gestorTaller gestor = new gestorTaller();
        try {
            //  ● Como se indica en el punto 6 aqui instanciamos una Bicicleta de cada tipo usando los datos de la tabla.
            BicicletaElectrica bici1 = new BicicletaElectrica("BIC-E01",2023,22.5,60,false,false);
            BicicletaElectrica bici2 = new BicicletaElectrica("BIC-E02",2022,24.0,45,true,false);
            BicicletaMontana bici3 = new BicicletaMontana("BIC-M01",2021,13.5,2);
            BicicletaMontana bici4 = new BicicletaMontana("BIC-M02",2020,12.0,1);
            //  ● Marcamos la Bicicleta "BIC-E01" con garantia extendida una vez creada.
            bici1.activarGarantia();
            //  ● Registramos todas las Bicicletas en el gestor del sistema.
            gestor.registroBicicleta(bici1);
            gestor.registroBicicleta(bici2);
            gestor.registroBicicleta(bici3);
            gestor.registroBicicleta(bici4);
            //  Aca cumplimos con los 2 ultimos requisitos del punto 6.
            //  ● Usamos la funcion Buscar por codigo del gestor
            String codigoBuscado= "BIC-E01";
            //  ● Almacenamos los resultados de la busqueda en un nuevo ArrayList
            ArrayList<Bicicleta> resultadoBusqueda =
                    gestor.buscarBicicleta(codigoBuscado);
            //  ● Mostramos el resultado de la busqueda almacenado anteriormente
            System.out.println("\n=== BUSQUEDA POR CODIGO: '"+codigoBuscado+"' ===");
            //  ● Para mostar el contenido del resultado de la busqueda usamos un for para no imprimir el Arraylist directamente.
            for (Bicicleta bicicleta : resultadoBusqueda) {
                System.out.println(bicicleta.mostrarDetalles());
            }
            System.out.println("\n---");
            //  ● Mostramos lo ultimo solicitado
            //  "listar todas las bicicletas registradas mediante el método toString() de cada objeto"
            System.out.println("=== LISTADO DE BICICLETAS ===");
            for (Bicicleta bicicleta : gestor.bicicletas) {
                System.out.println(bicicleta);
            }
        //  Aqui cerramos el try/catch con la notificacion en caso no se cumplan las validaciones de IllegalArgumentException solicitadas.
        }catch (IllegalArgumentException e){
            System.out.println("la weaita no funciona "+ e.getMessage());
        }




    }
}
