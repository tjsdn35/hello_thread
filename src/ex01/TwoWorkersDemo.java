package ex01;

public class TwoWorkersDemo {
	public static void main(String[] args) {
		// 첫번째 작업흐름 객체 생성
		NumberWorker numberWorker = new NumberWorker();
		// 두번째 작업흐름 객체 생성
		TextWorker textWorker = new TextWorker();
		
		// 객체가 생성될때 자동호출되는 생성자만 유일 자동실행
		// 내가 run()을 불러야 한다. 이것은 권장하지 않습니다.
		// 위임 start()
		numberWorker.start(); // start => run을 대신 실행
		textWorker.start();
		
		// 작업흐름은 현재 3개 = 메인 + numberWorker + textWorker
	}
}

// 첫번째 NumberWorker
class NumberWorker extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("숫자: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("숫자 작업 중단");
                return;
            }
        }
    }
}
	
// 두번째 TextWorker
class TextWorker extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("문자: 안녕하세요!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("문자 작업 중단");
                return;
            }
        }
    }
}