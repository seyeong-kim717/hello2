package test.main;
/*
 * [Java 참조 데이터 type]
 * 
 * String type
 * -id의 값을 들고 다니는 것은 참조데이터 타입.
 * -문자열을 다룰때 사용하는 데이터 type이다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		 //"김구라" 정보를 담고 있는 참조값(id값)이  변수에 들어간다.
		 String name="김구라";//싱글 따음표는 안됨  자바에서는.
	     String tmp=name;//참조값 복사해 주기
	     name="원숭이";//새로울 참조값으로 대입하기.
	     name=null;//name 변수를 empty(빈) 상태로 만들기.
	}
}
