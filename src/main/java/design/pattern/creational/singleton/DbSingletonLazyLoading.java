package design.pattern.creational.singleton;

public class DbSingletonLazyLoading {

	private static DbSingletonLazyLoading instance = null;

	private DbSingletonLazyLoading() {
	}

	public static DbSingletonLazyLoading getInstance() {
		if (instance == null) {
			instance = new DbSingletonLazyLoading();
		}
		return instance;
	}
}
