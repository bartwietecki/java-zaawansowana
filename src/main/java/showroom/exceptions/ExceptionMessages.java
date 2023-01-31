package showroom.exceptions;

public enum ExceptionMessages {

    OBJECT_CANNOT_BE_NULL("E-000001", "Obiekt nie może mieć wartości null."),
    OBJECT_NOT_FOUND_BY_PROVIDED_ID("E-000001","Obiekt nie może mieć wartości null.");

    private final String code;
    private final String message;
    ExceptionMessages(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }
}
