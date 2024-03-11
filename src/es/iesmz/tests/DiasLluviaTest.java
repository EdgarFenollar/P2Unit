package es.iesmz.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DiasLluviaTest {
    @BeforeEach
    public void beforeEach() {
        System.out.println("EXECUTE PROVA");
    }

    @Test
    void registroDia() {
        DiasLluvia diasLluvia = new DiasLluvia();
        assertTrue(diasLluvia.registroDia(1, 1, true));
        assertFalse(diasLluvia.registroDia(0, 1, true));
    }

    @Test
    void consultarDia() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, true);
        diasLluvia.registroDia(31, 12, false);
        assertTrue(diasLluvia.consultarDia(1, 1));
        assertFalse(diasLluvia.consultarDia(0, 1));

    }
}
