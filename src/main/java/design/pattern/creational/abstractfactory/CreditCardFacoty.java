package design.pattern.creational.abstractfactory;

public abstract class CreditCardFacoty {

	public static CreditCardFacoty getCreditCardFactory(int creditScore) {
		if (creditScore > 650) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
	}

	public abstract CreditCard getCreditCard(CardType cardType);

	public abstract Validator getValidator(CardType cardType);
}
