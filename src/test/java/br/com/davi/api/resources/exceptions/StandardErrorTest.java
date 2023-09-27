package br.com.davi.api.resources.exceptions;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class StandardErrorTest {

    @Test
    void testStandardErrorProperties() {
        LocalDateTime timestamp = LocalDateTime.now();
        Integer status = 404;
        String error = "Objeto não encontrado";
        String path = "/user";

        StandardError standardError = new StandardError(timestamp, status, error, path);

        assertEquals(timestamp, standardError.getTimestamp());
        assertEquals(status, standardError.getStatus());
        assertEquals(error, standardError.getError());
        assertEquals(path, standardError.getPath());
    }
}






