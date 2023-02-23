package sp0214;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// [xml 으로 하는 방식]
//		AbstractApplicationContext ctx = new GenericXmlApplicationContext("sp0214/app_config.xml"); // app_config.xml, xml방식 쓸 때(직접 정의) 
//		My myInfo = ctx.getBean("myInfo", My.class); 
		
		
		// [어노테이션 설정 방법]
		//app_config.xml에서 My인터페이스 상속받고있는 클래스들 중에 참조변수의 이름이 myInfo인 객체를 가져와달라
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("sp0214/app_config2.xml"); // app_config2.xml, annotation방식 쓸 때 
		My myInfo = ctx.getBean(My.class); 
		
		
		My myInfo2;
		myInfo.getInfo();
		
		
	}//main
}//class
