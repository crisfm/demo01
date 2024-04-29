package com.tdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(-1, calc.sumar(-4, 3));
    }
    
    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(4, 3));
        assertEquals(-7, calc.restar(3, 10));
    }
    
    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(12, calc.multiplicar(3, 4));
        assertEquals(-15, calc.multiplicar(3, -5));
    }
    
    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(3, calc.dividir(9, 3));
        assertEquals(-4, calc.dividir(-12, 3));
    }
    
    @Test
    public void testDividirPorCero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }
}
