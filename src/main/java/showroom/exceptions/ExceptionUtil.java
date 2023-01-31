package showroom.exceptions;

public class ExceptionUtil {
    // dostarcza nam metodę pomocniczą do robienia Exceptiona.

    public static String getExceptionMessage(String code, String message) {
        return "code: " + code + " message: " + message;
    }
}
