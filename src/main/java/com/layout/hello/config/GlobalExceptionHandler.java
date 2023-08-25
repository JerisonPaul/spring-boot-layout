package com.layout.hello.config;

import com.layout.hello.constants.ErrorCode;
import com.layout.hello.dto.StandardResponseDTO;
import com.layout.hello.util.HttpResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author JerisonPaul
 * @date 2023/8/25 下午11:33
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    /**
     * null exception
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public StandardResponseDTO MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        // Get the ObjectError object from the exception object
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // Then extract the error message to return
        return HttpResponseUtil.error(ErrorCode.ILLEGAL_PARAMETER_EXCEPTION.code(), objectError.getDefaultMessage());
    }

    /**
     * other exception
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public StandardResponseDTO ExceptionHandler(Exception e) {
        logger.info("other exception = {}", e);
        return HttpResponseUtil.error(ErrorCode.OTHER_EXCEPTION.code(), e.getMessage());
    }
}
