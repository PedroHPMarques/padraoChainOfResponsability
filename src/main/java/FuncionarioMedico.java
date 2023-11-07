public class FuncionarioMedico extends Funcionario {
    public FuncionarioMedico(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoExame.getTipoDocumentoExame());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Médico";
    }
}
