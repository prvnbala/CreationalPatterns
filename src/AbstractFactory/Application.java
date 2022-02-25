package AbstractFactory;

import AbstractFactory.factory.CreditCardFactory;
import AbstractFactory.model.CardType;
import AbstractFactory.model.CreditCard;

public class Application {
    public static void main(String[] args) {
        CreditCard card1 = CreditCardFactory.getCreditCardFactory(700).getCreditCard(CardType.GOLD);
        CreditCard card2 = CreditCardFactory.getCreditCardFactory(650).getCreditCard(CardType.PLATINUM);

        System.out.println(card1.getClass());
        System.out.println(card2.getClass());
    }
}
