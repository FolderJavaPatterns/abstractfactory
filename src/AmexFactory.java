import creditcards.AmexGoldCreditCard;
import creditcards.AmexPlatinumCreditCard;
import creditcards.CreditCard;
import validators.AmexGoldValidator;
import validators.AmexPlatinumValidator;
import validators.Validator;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new AmexGoldCreditCard();
			case PLATINUM:
				return new AmexPlatinumCreditCard();
			default:
				break;
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new AmexGoldValidator();
			case PLATINUM:
				return new AmexPlatinumValidator();
		}
		return null;
	}
}
