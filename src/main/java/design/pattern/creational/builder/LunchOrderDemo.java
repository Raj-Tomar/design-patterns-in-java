package design.pattern.creational.builder;

public class LunchOrderDemo {

	public static void main(String[] args) {

		LunchOrder order = new LunchOrder();

		order.setBread("Wheat");
		order.setCondiments("Lettuce");
		order.setDressing("Mustard");
		order.setMeat("Ham");

		// After commenting setters we will be getting nulls
		// to solve this use telescoping constructors
		System.out.println(order.getBread());
		System.out.println(order.getCondiments());
		System.out.println(order.getDressing());
		System.out.println(order.getMeat());

		LunchOrderTelescoping orderTelescoping = new LunchOrderTelescoping("Wheat", "Lettuce", "Mustard", "Ham");
		System.out.println(orderTelescoping.getBread());
		System.out.println(orderTelescoping.getCondiments());
		System.out.println(orderTelescoping.getDressing());
		System.out.println(orderTelescoping.getMeat());

		LunchOrderBuilder.Builder builder = new LunchOrderBuilder.Builder();
		builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

		LunchOrderBuilder lunchOrder = builder.build();
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
	}

}
