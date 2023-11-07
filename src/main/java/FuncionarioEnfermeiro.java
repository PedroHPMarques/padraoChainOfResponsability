public class FuncionarioEnfermeiro extends Funcionario {
    public FuncionarioEnfermeiro(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoReceita.getTipoDocumentoReceita());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Enfermeiro";
    }
}
