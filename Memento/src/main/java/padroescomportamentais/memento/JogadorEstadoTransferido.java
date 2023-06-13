package padroescomportamentais.memento;

import padroescomportamentais.state.Aluno;

public class JogadorEstadoTransferido implements JogadorEstado {

    private JogadorEstadoTransferido() {};
    private static JogadorEstadoTransferido instance = new JogadorEstadoTransferido();
    public static JogadorEstadoTransferido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Transferido";
    }

}
