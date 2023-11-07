public class FuncionarioAdmSaude extends Funcionario{

    public FuncionarioAdmSaude(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoDadosPaciente.getTipoDocumentoDadosPaciente());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Recepção";
    }
}

