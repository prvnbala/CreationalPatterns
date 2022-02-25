package AbstractFactory.factory;

import AbstractFactory.model.CardType;
import AbstractFactory.model.CreditCard;
import AbstractFactory.model.Validator;

public abstract class CreditCardFactory {
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);
    public abstract Validator getValidator(CardType cardType);

}
