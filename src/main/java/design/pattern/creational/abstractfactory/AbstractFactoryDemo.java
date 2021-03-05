package design.pattern.creational.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		CreditCardFacoty abstractFactory = CreditCardFacoty.getCreditCardFactory(700);
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFacoty.getCreditCardFactory(600);
		card = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(card.getClass());
		
	}
}
