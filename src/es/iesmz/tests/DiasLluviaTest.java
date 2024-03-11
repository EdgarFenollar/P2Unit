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

    @Test
    void contarDiasLluviosos() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, true);
        diasLluvia.registroDia(2, 1, false);
        diasLluvia.registroDia(3, 1, true);
        diasLluvia.registroDia(4, 1, false);
        diasLluvia.registroDia(5, 1, true);
        assertEquals(3, diasLluvia.contarDiasLluviosos());
    }

    @Test
    void trimestreLluvioso() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, false);
        diasLluvia.registroDia(2, 1, false);
        diasLluvia.registroDia(3, 1, false);
        diasLluvia.registroDia(4, 1, false);
        diasLluvia.registroDia(5, 1, true);
        diasLluvia.registroDia(6, 1, false);
        diasLluvia.registroDia(7, 1, true);
        diasLluvia.registroDia(8, 1, false);
        diasLluvia.registroDia(9, 1, true);
        diasLluvia.registroDia(10, 1, false);
        diasLluvia.registroDia(11, 1, true);
        diasLluvia.registroDia(12, 1, false);
        assertEquals(4, diasLluvia.contarDiasLluviosos());
    }

    @Test
    public void testPrimerDiaLluvioso() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, true);
        assertEquals(1, diasLluvia.primerDiaLluvioso());
    }

    @Test
    public void testPrimerDiaLluvioso_noLluvia() {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registroDia(1, 1, false);
        assertEquals(-1, diasLluvia.primerDiaLluvioso());
    }

}
