package com.example.demo.service;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.http.*;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.ConnectException;
import java.net.URI;
import java.time.Instant;
import java.util.Arrays;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
                                                                         HttpHeaders headers, HttpStatusCode status,
                                                                         WebRequest request) {
        String supportedMethods = StringUtils.join(Arrays.toString(ex.getSupportedMethods()), ", ");
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(status,
                "Request method not supported");
//        problemDetail.setType(URI.create("http://localhost:8080/errors/book-not-found"));
        problemDetail.setTitle("Método Não Suportado");
        problemDetail.setProperty("timestamp", Instant.now());
        return ResponseEntity.status(status).body(problemDetail);
    }

    @ExceptionHandler(ConnectException.class)
    public ResponseEntity<ProblemDetail> handleConnectException(ConnectException ex) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, ex.getMessage());
        problemDetail.setProperty("timestamp", Instant.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(problemDetail);
    }

    @ExceptionHandler(ErrorGenerico.class)
    public ResponseEntity<ProblemDetail> handleErrorGenerico(ErrorGenerico ex) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, ex.getMessage());
        problemDetail.setProperty("timestamp", Instant.now());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(problemDetail);
    }


}