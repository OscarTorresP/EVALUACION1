/**
 *      Interfaz con 2 metodos solicitados en el punto 3.
 *  -La primera permite consultar en cualquier momento si la bicicleta tiene una garantía extendida activa.
 *  -La segunda permite activar la garantía extendida de la bicicleta.
 */
public interface ConGarantiaExtendida {
    boolean validaGarantia();
    void activarGarantia();
}

