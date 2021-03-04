package design.pattern.creational.singleton;

public class DbSingletonEagerlyLoading {

	private static DbSingletonEagerlyLoading instance = new DbSingletonEagerlyLoading();

	private DbSingletonEagerlyLoading() {
	}

	public static DbSingletonEagerlyLoading DbSingletonEagerlyLoading() {
		return instance;
	}

	public static DbSingletonEagerlyLoading getInstance() {
		return instance;
	}
}
