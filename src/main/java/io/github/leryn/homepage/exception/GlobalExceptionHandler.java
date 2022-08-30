package io.github.leryn.homepage.exception;

import io.github.leryn.homepage.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Leryn
 * @since Leryn 1.0.0
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(Exception.class)
  @ResponseBody
  public Result error(Exception e){
    log.error(e.getMessage());
    e.printStackTrace();
    return Result.onError(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage());
  }

}
