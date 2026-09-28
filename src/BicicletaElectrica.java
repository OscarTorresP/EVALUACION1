/** SubClase bicicletaElectrica hereda de la clase Bicicleta codigoBicicleta, anoFabricacion y peso.
 *  Tiene 3 atributis propios (especializaciones) autonomia, certificacionBateria y garantiaExtendida.
 *  cuenta con 5 metodos todos heredados:
 *  2 implementados desde la interfaz ConGarantiaExtendida y 3 herencia de la clase padre Bicicleta.
 */
public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida{
    private int autonomia;
    private boolean certificacionBateria;
    private boolean garantiaExtendida;

    public BicicletaElectrica(String codigoBicileta, int anoFabricacion, double peso, int autonomia, boolean certificacionBateria, boolean garantiaExtendida) {
        super(codigoBicileta, anoFabricacion, peso);
        this.autonomia = autonomia;
        this.certificacionBateria = certificacionBateria;
        this.garantiaExtendida = garantiaExtendida;
    }
    //  ● No hay validadores en los setter ya que los atributos que deben ser validados ya tienen la validacion incluida
    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public boolean isCertificacionBateria() {
        return certificacionBateria;
    }

    public void setCertificacionBateria(boolean certificacionBateria) {
        this.certificacionBateria = certificacionBateria;
    }

    public boolean isGarantiaExtendida() {
        return garantiaExtendida;
    }

    public void setGarantiaExtendida(boolean garantiaExtendida) {
        this.garantiaExtendida = garantiaExtendida;
    }
    //  ● toString sobreescrito desde la clase padre
    @Override
    public String toString() {
        return "Codigo: " + getCodigoBicicleta() +" | Año: " + getAnoFabricacion();
    }
    //  ● Metodo heredado desde la clase padre modificado especificamente para la subclase bicicletaElectrica
    @Override
    public int costoMantencion() {
        if (!certificacionBateria){
            return  (int)(45000*1.25);
        }
        return 45000;
    }
    //  ● Metodo implementado desde la interfaz para activar la garantia extendida
    @Override
    public void activarGarantia() {
    if (!garantiaExtendida){
        setGarantiaExtendida(true);
    }
    }
    //  ● metodo implementado para validar si la garantia extendida esta activa
    @Override
    public boolean validaGarantia() {
        return garantiaExtendida;
    }
    //  ● Metodo heredado de la clase padre, alternativo al toString para mostrar todos los atributos y no solo 2.
    @Override
    public String mostrarDetalles() {
        return "Tipo: Bicicleta Electrica"
                + " | Código: " + getCodigoBicicleta()
                + " | Año de Fabricacion: " + getAnoFabricacion()
                + " | Peso: " + getPeso()
                + " | Autonomía: " + getAutonomia()
                + " | Bateria Certificada: " + (isCertificacionBateria() ? "Si":"No")
                + " | Garantia Extendida: " + (isGarantiaExtendida() ? "Si":"No")
                + " | Costo: $" + costoMantencion();
    }
}
