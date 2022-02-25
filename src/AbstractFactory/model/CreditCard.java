package AbstractFactory.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class CreditCard {
    int cardNumberLength;
    int cvvNumber;
}
