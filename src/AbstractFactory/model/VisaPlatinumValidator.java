package AbstractFactory.model;

public class VisaPlatinumValidator implements Validator{

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
