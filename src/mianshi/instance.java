package mianshi;

public class instance {
	private static instance i = new instance();

	private instance() {
		
	}
	
	public static synchronized instance get_instance() {
		return i;
	}
	
	public static void main(String[] args) {
		
	}
}
