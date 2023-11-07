public class TipoDocumentoDadosPaciente implements TipoDocumento{

    private static TipoDocumentoDadosPaciente tipoDocumentoDadosPaciente = new TipoDocumentoDadosPaciente();

    private TipoDocumentoDadosPaciente(){};

    public static TipoDocumentoDadosPaciente getTipoDocumentoDadosPaciente() {
        return tipoDocumentoDadosPaciente;
    }
}
