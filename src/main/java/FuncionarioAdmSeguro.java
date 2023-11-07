public class FuncionarioAdmSeguro extends Funcionario{
    public FuncionarioAdmSeguro(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoPlano.getTipoDocumentoPlano());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Administrador plano de saúde";
    }
}
