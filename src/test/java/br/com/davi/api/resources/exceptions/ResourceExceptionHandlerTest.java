package br.com.davi.api.resources.exceptions;

import br.com.davi.api.services.exceptions.DataIntegrityViolationException;
import br.com.davi.api.services.exceptions.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResourceExceptionHandlerTest {

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Mock
    private HttpServletRequest request;

    @InjectMocks
    private ResourceExceptionHandler resourceExceptionHandler;

    @Test
    void objectNotFoundExceptionHandler() {

        ObjectNotFoundException exception = new ObjectNotFoundException("Objeto não encontrado");
        when(request.getRequestURI()).thenReturn("/user/");

        ResponseEntity<StandardError> responseEntity = resourceExceptionHandler.objectNotFound(exception, request);

        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
        assertEquals("Objeto não encontrado", responseEntity.getBody().getError());
        assertEquals("/user/", responseEntity.getBody().getPath());
    }

    @Test
    void dataIntegrityViolationExceptionHandler() {

        DataIntegrityViolationException exception = new DataIntegrityViolationException("Data integrity violation");
        when(request.getRequestURI()).thenReturn("/user/");

        ResponseEntity<StandardError> responseEntity = resourceExceptionHandler.objectNotFound(exception, request);

        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
        assertEquals("Data integrity violation", responseEntity.getBody().getError());
        assertEquals("/user/", responseEntity.getBody().getPath());
    }








@Test
    void testObjectNotFound() {
    }
}