package padroescomportamentais.memento;

public class JogadorEstadoComTime implements JogadorEstado {

    private JogadorEstadoComTime() {};
    private static JogadorEstadoComTime instance = new JogadorEstadoComTime();
    public static JogadorEstadoComTime getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Com Time";
    }

}
