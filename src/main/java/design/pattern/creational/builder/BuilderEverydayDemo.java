package design.pattern.creational.builder;

public class BuilderEverydayDemo {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("This is an example ");
		builder.append("of Builder Pattern. ");
		builder.append("It has a methods to append ");
		builder.append("almost anything we want to a String. ");
		builder.append(111);
		System.out.println(builder);
	}
}
