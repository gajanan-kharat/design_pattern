class StaticBlockEagerInitialization {
	private static StaticBlockEagerInitialization staticBlockSingleton;
	private StaticBlockEagerInitialization(){}
	static{
		try{
		staticBlockSingleton=new StaticBlockEagerInitialization();
		}catch(Exception e){
			throw new RuntimeException("RT exception is occured here!!!");
		}
	}
	public static StaticBlockEagerInitialization getInstance(){
		return staticBlockSingleton;
	}
}
public class StaticBlockSingleton {
	public static void main(String[] args) {
		System.out.println(StaticBlockEagerInitialization.getInstance());
		System.out.println(StaticBlockEagerInitialization.getInstance());
		System.out.println(StaticBlockEagerInitialization.getInstance());
	}
}
