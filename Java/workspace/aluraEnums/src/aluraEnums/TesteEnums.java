package aluraEnums;

public class TesteEnums {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.MAX_PRIORITY);
		
		Thread t = new Thread(() -> System.out.println("rodando ..."));
		
		t.setPriority(Thread.MAX_PRIORITY);
		
		t.start();
		
		Thread th2 = new Thread(() -> {for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}});
			
		th2.setPriority(Thread.MAX_PRIORITY);
		
		th2.start();
	}

}
