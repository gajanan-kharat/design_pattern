class EagerInitialization {
	private static EagerInitialization eagerInitialization = new EagerInitialization();
	private EagerInitialization() {
	}
	public static EagerInitialization getInstance(){
		return eagerInitialization;
	}
}

public class ClassLoadingSingleton {

	public static void main(String[] args) {
		System.out.println(EagerInitialization.getInstance());
		System.out.println(EagerInitialization.getInstance());
		System.out.println(EagerInitialization.getInstance());
		System.out.println(EagerInitialization.getInstance());
	}
}
