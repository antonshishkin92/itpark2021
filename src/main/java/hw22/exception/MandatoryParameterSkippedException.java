package hw22.exception;

/***
 * Если параметр appId не указан при запуске программы
 */

public class MandatoryParameterSkippedException extends RuntimeException {
    public MandatoryParameterSkippedException(String message) {
        super(message);
    }
}
