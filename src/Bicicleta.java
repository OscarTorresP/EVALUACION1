/**
 * Clase Abstracta(padre) Bicicleta:
 * En esta clase se recopilan todos los atributos y metodos
 * que tienen en comun ambas subclases (Electricas y de Montaña)
 */
public abstract class Bicicleta {
    private String codigoBicicleta;
    private int anoFabricacion;
    private double peso;

    public Bicicleta(String codigoBicicleta, int anoFabricacion, double peso) {
        this.setCodigoBicicleta(codigoBicicleta);
        this.setAnoFabricacion(anoFabricacion);
        this.setPeso(peso);
    }

    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }
    /*
        Segun lo indicado en el punto 4 las validaciones se aplican en los Setter.
        Como los atributos a validar son los se la clase padre estos se definen solo en aca
        Los atributos con sus validaciones se heredan en los constructores de las subclases.
    */
    public void setCodigoBicicleta(String codigoBicicleta) {
        //  ● La validacion de codigo es que no puede estar vacio ni ser nulo
        if (codigoBicicleta ==null|| codigoBicicleta.isBlank()){
            throw new IllegalArgumentException("El codigo no puede ser nulo");
        }
        this.codigoBicicleta = codigoBicicleta;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        //  ● La validacion de año de fabricacion es que debe estar entre el año 2000 y 2026.
        if (anoFabricacion<2000 || anoFabricacion>2026){
            throw new IllegalArgumentException("El año de fabricacion debe estar entre los años 2000 y 2026.");
        }
        this.anoFabricacion = anoFabricacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        //  ● La validacion de peso es que debe ser mayor a 0.
        if (peso<=0){
            throw new IllegalArgumentException("El peso debe ser mayor a 0");
        }
        this.peso = peso;
    }
    //  ● el metodo toString() solo muestra el dodigo y la fecha de fabricacion segun lo requerido en el punto 2
    @Override
    public String toString() {
        return "Codigo: " + getCodigoBicicleta() +" | Año: " + getAnoFabricacion();
    }
    //  ● Declaracion de metodos comunes para las subclases pero con comportamiento independiente
    //  ● El metodo mostrarDetalles() se requiere para poder mostrar todos los atributos en la busqueda por codigo.
    public abstract String mostrarDetalles();
    //  ● El metodo costoMantencion() tambien es comun para ambas clases pero se utiliza de forma diferente.
    public abstract int costoMantencion();
}
