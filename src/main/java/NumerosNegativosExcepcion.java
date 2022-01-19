public class NumerosNegativosExcepcion extends Exception {

    public NumerosNegativosExcepcion() {
        super();
    }

    public NumerosNegativosExcepcion (String mensaje) {
        // calling the constructor of parent Exception
        super(mensaje);
    }

    public NumerosNegativosExcepcion (String mensaje, Throwable causa) {
        // calling the constructor of parent Exception
        super(mensaje, causa);
    }


}
