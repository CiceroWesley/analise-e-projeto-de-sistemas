package singleton;

public class Main {
	public static void main(String[] args) {
		//mesma instância em ambos os prints
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
	}

}
