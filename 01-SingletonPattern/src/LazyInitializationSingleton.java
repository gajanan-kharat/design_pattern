
class DynamicSingleton {
	private static DynamicSingleton dynamicInstance;
	private DynamicSingleton() {
	}
	public static DynamicSingleton getInstance() {
		if (dynamicInstance == null)
			dynamicInstance = new DynamicSingleton();
		return dynamicInstance;
	}
}
public class LazyInitializationSingleton {
	public static void main(String[] args) {
		System.out.println(DynamicSingleton.getInstance());
		System.out.println(DynamicSingleton.getInstance());
		System.out.println(DynamicSingleton.getInstance());
	}
}
