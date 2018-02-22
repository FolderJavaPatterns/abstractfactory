package validators;

import creditcards.CreditCard;

public interface Validator {
	public boolean isValid(CreditCard creditCard);
}
