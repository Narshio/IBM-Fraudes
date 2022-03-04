package com.ibm.api.fraudes.exeptions.hanlder;

import com.ibm.api.fraudes.exeptions.NotFoudException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler( value = NotFoudException.class)
    public ResponseEntity<?> noExistToExeption(NotFoudException exception)
    {
        Map<String, Object> answer = new HashMap<String, Object>();
        answer.put("Error", exception.getMessage());
        return new ResponseEntity<>(answer, HttpStatus.NOT_FOUND);
    }
}
