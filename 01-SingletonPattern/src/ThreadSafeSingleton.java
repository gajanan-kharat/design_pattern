class ThreadSafe {
	private static ThreadSafe threadSafeObj;

	private ThreadSafe() {
	}
 // Method sync to get singleton object
	public static synchronized ThreadSafe getInstance() {
		if (threadSafeObj == null)
			threadSafeObj = new ThreadSafe();
		return threadSafeObj;
	}
	//Block sync to get singleton object with double check
	public static ThreadSafe getObject(){
		if(threadSafeObj==null){
			synchronized (ThreadSafe.class) {
				if(threadSafeObj==null){
					threadSafeObj = new ThreadSafe();
				}
			}
		}
		return threadSafeObj;
	}
}


public class ThreadSafeSingleton {

	public static void main(String[] args) {
		System.out.println(ThreadSafe.getInstance());
		System.out.println(ThreadSafe.getInstance());
		System.out.println(ThreadSafe.getInstance());
		System.out.println(ThreadSafe.getObject());

	}

}
