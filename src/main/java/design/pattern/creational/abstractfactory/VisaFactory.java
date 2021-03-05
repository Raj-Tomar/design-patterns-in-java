package design.pattern.creational.abstractfactory;

public class VisaFactory extends CreditCardFacoty {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new VisaGoldCreditCard();
		case PLATINUM:
			return new VisaPlatinumCreditCard();
		default:
			break;
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new VisaGoldValidator();
		case PLATINUM:
			return new VisaPlatinumValidator();
		default:
			break;
		}
		return null;
	}

}
