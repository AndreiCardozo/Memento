package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;
import padroescomportamentais.memento.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class JogadorTest {

    @Test
    void deveArmazenarEstados() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        jogador.setEstado(JogadorEstadoComTime.getInstance());
        assertEquals(2, jogador.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        jogador.setEstado(JogadorEstadoComTime.getInstance());
        jogador.restauraEstado(0);
        assertEquals(JogadorEstadoAposentado.getInstance(), jogador.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        jogador.setEstado(JogadorEstadoComTime.getInstance());
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        jogador.restauraEstado(2);
        assertEquals(JogadorEstadoComTime.getInstance(), jogador.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        Jogador jogador = new Jogador();
        assertThrows(IllegalArgumentException.class, () -> jogador.restauraEstado(0));
    }

}
