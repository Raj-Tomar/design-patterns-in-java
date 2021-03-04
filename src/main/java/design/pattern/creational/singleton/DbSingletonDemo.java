package design.pattern.creational.singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingletonEagerlyLoading eagerlyInstance = DbSingletonEagerlyLoading.getInstance();
		System.out.println(eagerlyInstance);

		DbSingletonEagerlyLoading anotherEagerlyInstance = DbSingletonEagerlyLoading.getInstance();
		System.out.println(anotherEagerlyInstance);
		
		DbSingletonLazyLoading lazyInstance = DbSingletonLazyLoading.getInstance();
		System.out.println(lazyInstance);
		
		DbSingletonLazyLoading anotherLazyInstance = DbSingletonLazyLoading.getInstance();
		System.out.println(anotherLazyInstance);
		
		DbSingletonThreadSafe threadSafeInstance = DbSingletonThreadSafe.getInstance();
		System.out.println(threadSafeInstance);
		
		DbSingletonThreadSafe anotherThreadSafeInstance = DbSingletonThreadSafe.getInstance();
		System.out.println(anotherThreadSafeInstance);
		
	}
}
