enum SigletonEnum {
	INSTANCE;
	private SigletonEnum(){
		System.out.println();
	}
}
public class EnumSingleton {
public static void main(String[] args) {
	System.out.println(SigletonEnum.INSTANCE);
	System.out.println(SigletonEnum.INSTANCE);
	System.out.println(SigletonEnum.INSTANCE);
}
}
