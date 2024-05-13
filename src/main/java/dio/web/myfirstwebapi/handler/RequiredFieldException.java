package dio.web.myfirstwebapi.handler;

public class RequiredFieldException extends BusinessException {
    public RequiredFieldException(String message) {
        super("O campo [%s] é obrigatório.", message);
    }
}
