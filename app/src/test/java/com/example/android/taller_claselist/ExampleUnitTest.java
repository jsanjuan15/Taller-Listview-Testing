package com.example.android.taller_claselist;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void celulares_nokia() {
        Celular n1 = new Celular(10, 4, 2, 2, 1);
        Celular n2 = new Celular(10, 4, 2, 2, 1);
        Celular n3 = new Celular(10, 4, 2, 2, 1);
        Celular n4 = new Celular(10, 4, 1, 0, 1);


        Celular celular[] = {n1, n2, n3, n4};
        ArrayList<Celular> cel = new ArrayList<>(Arrays.asList(celular));
        assertEquals(10, Metodos.celularesPrecioNokia(cel),0);

    }

    @Test
    public void marca_apple() {
        Celular n1 = new Celular(10, 4, 3, 0, 1);
        Celular n2 = new Celular(10, 4, 3, 0, 1);
        Celular n3 = new Celular(10, 4, 3, 0, 1);
        Celular n4 = new Celular(10, 4, 1, 0, 1);


        Celular celular[] = {n1, n2, n3, n4};
        ArrayList<Celular> cel = new ArrayList<>(Arrays.asList(celular));
        assertEquals(3, Metodos.ObtenerMarcaApple(cel));

    }

    @Test
    public void precio_capacidad() {
        Celular n1 = new Celular(10, 4, 1, 0, 0);
        Celular n2 = new Celular(10, 4, 1, 0, 0);
        Celular n3 = new Celular(10, 4, 1, 0, 0);
        Celular n4 = new Celular(11, 1, 1, 0, 0);


        Celular celular[] = {n1, n2, n3, n4};
        ArrayList<Celular> cel = new ArrayList<>(Arrays.asList(celular));
        assertEquals(3, Metodos.ObtenerMarcaApple(cel));
    }
}