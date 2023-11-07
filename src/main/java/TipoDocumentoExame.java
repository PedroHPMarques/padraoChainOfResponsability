public class TipoDocumentoExame implements TipoDocumento {
    private static TipoDocumentoExame tipoDocumentoExame = new TipoDocumentoExame();

    private TipoDocumentoExame() {};

    public static TipoDocumentoExame getTipoDocumentoExame() {
        return tipoDocumentoExame;
    }
}
