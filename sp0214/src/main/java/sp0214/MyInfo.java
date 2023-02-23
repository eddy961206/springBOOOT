package sp0214;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyInfo implements My {
	@Value("${my.userName}") // ${}는 text.properties로 가서 똑같은 거 찾아달라는 뜻 
	private String name;
	@Value("${height}") // ${}는 text.properties로 가서 똑같은 거 찾아달라는 뜻 
	private double height;
	@Value("${weight}") // ${}는 text.properties로 가서 똑같은 거 찾아달라는 뜻 
	private double weight;
	@Value("#{${hobbys}}") // ${}는 text.properties로 가서 똑같은 거 찾아달라는 뜻 
	private ArrayList<String> hobbys;
	
	@Autowired	// ioc컨테이너에서 객체를 가져오기. 객체 주입 자동으로 찾은다음 해줌. new 할 필요 없음
	private BMICalculator bmiCalculator;
	
	public void getInfo() {
		System.out.println(" [ 개인 신상정보 ] ");
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("취미 : " + hobbys);
		bmiCalculator.bmiCalculation(weight, height);
	}
	
}
