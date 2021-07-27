package br.com.pedro.beloprojeto;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void mainTest() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        final String[] args = { "1998-08-15" };
        App.main(args);
        assertEquals("[22]" + System.lineSeparator(), outContent.toString());
        
    }
}
