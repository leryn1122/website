package io.github.leryn.homepage.model;

/**
 * @author Leryn
 * @since Leryn 1.0.0
 */
public class Result<T> {

  // Static Fields.

  private static final int SUCCESS_CODE = 0;

  private static final int ERROR_CODE = -1;

  // Static Methods.
  /** Http code. */
  private int code;
  /** Http message. */
  private String message;
  private T data;

  private Result() {
    this(0, null, null);
  }

  private Result(int code, String message) {
    this(code, message, null);
  }

  private Result(int code, String message, T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public static <T> Result<T> onSuccess(int code, String message, T data) {
    return new Result<>(code, message, data);
  }

  public static <T> Result<T> onSuccess(int code, String message) {
    return onSuccess(code, message, null);
  }

  public static <T> Result<T> onSuccess(String message) {
    return onSuccess(SUCCESS_CODE, message, null);
  }

  public static <T> Result<T> onSuccess(String message, T data) {
    return onSuccess(SUCCESS_CODE, message, data);
  }

  public static <T> Result<T> onSuccess(T data) {
    return onSuccess(SUCCESS_CODE, "", data);
  }

  public static <T> Result<T> onError(int code, String message, T data) {
    return new Result<>(code, message, data);
  }

  public static <T> Result<T> onError(int code, String message) {
    return onError(code, message, null);
  }

  public static <T> Result<T> onError(String message) {
    return onError(ERROR_CODE, message, null);
  }

  public static <T> Result<T> onError(String message, T data) {
    return onError(ERROR_CODE, message, data);
  }

  public int getCode() {
    return this.code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public T getData() {
    return this.data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
