package ex01;

public class PauseHello {
	public static void main(String[] args) throws InterruptedException {
		System.out.print("안녕하세요!\n");
		// 잠시동안(500ms) 쉬어(sleep) 감
		// 500밀리초 = 0.5초
		// 1000밀리초가 = 1초
		Thread.sleep(10000);
		// 다시 만났어요
		String hi = "다시 만났어요";
		System.out.println(hi);
	}

}
