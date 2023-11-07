import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    FuncionarioAdmSaude recepcao;
    FuncionarioMedico medico;
    FuncionarioAdmSeguro admSeguro;
    FuncionarioEnfermeiro enfermeiro;

    @BeforeEach
    void setUp(){
        recepcao = new FuncionarioAdmSaude(enfermeiro);
        medico = new FuncionarioMedico(null);
        admSeguro = new FuncionarioAdmSeguro(null);
        enfermeiro = new FuncionarioEnfermeiro(medico);
    }

    @Test
    void deveRetornarEnfermeiroParaValidarReceita(){
        assertEquals("Enfermeiro", enfermeiro.assinarDocumento(new Documento(TipoDocumentoReceita.getTipoDocumentoReceita())));
    }
    @Test
    void deveRetornarADmSeguroParaValidarPlano(){
        assertEquals("Administrador plano de saúde", admSeguro.assinarDocumento(new Documento(TipoDocumentoPlano.getTipoDocumentoPlano())));
    }
    @Test
    void deveRetornarMedicoParaValidarExame(){
        assertEquals("Médico", medico.assinarDocumento(new Documento(TipoDocumentoExame.getTipoDocumentoExame())));
    }
    @Test
    void deveRetornarRecepcaoParaValidarDadosPaciente(){
        assertEquals("Recepção", recepcao.assinarDocumento(new Documento(TipoDocumentoDadosPaciente.getTipoDocumentoDadosPaciente())));
    }

}