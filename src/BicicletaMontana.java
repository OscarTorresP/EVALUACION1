/** SubClase bicicletaMontana hereda de la clase Bicicleta codigoBicicleta, anoFabricacion y peso.
 *  Tiene 1 atributis propio (especializaciones) cantidadSuspensiones.
 *  cuenta con 3 metodos todos heredados:
 *  2 implementados desde la interfaz ConGarantiaExtendida y 1 herencia de la clase padre Bicicleta.
 */
public class BicicletaMontana extends Bicicleta{
    private int cantidadSuspensiones;

    public BicicletaMontana(String codigoBicileta, int anoFabricacion, double peso, int cantidadSuspensiones) {
        super(codigoBicileta, anoFabricacion, peso);
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        this.cantidadSuspensiones = cantidadSuspensiones;
    }
    //  ● toString sobreescrito desde la clase padre
    @Override
    public String toString() {
        return "Codigo: "+ getCodigoBicicleta()+" | Año: "+getAnoFabricacion();
    }
    //  ● Metodo heredado desde la clase padre modificado especificamente para la subclase bicicletaMontana
    @Override
    public int costoMantencion() {
        if(cantidadSuspensiones>1){
            return (int)(30000*1.15);
        }
        return 30000;
    }
    //  ● Metodo heredado de la clase padre, alternativo al toString para mostrar todos los atributos y no solo 2.
    @Override
    public String mostrarDetalles() {
        return "Tipo: Bicicleta de Montaña"
                + " | Código: " + getCodigoBicicleta()
                + " | Año: " + getAnoFabricacion()
                + " | Peso: " + getPeso()
                + " | Suspensiones: " + getCantidadSuspensiones()
                + " | Costo: $" + costoMantencion();
    }
}
