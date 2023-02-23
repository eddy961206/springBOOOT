package sp0214;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Configuration 	// 얘는 xml방식 아닌 annotation방식할 때 사용. (app_config2)
@AllArgsConstructor
@NoArgsConstructor
@Data    //롬복을 설치햇고 pom.xml에 넣어놨으니까 가능
public class BMICalculator {
	
	@Value("${lowWeight}")	// ${}는 text.properties로 가서 원하는 거 찾아달라는 뜻
	private double lowWeight;
	@Value("${normal}")	
//	@Value("23")	// @Value("23")는 직접 다이렉트로 값 넣는 방법임. 쓰는 경우 거의 없음. set씀. 그냥 있다 정도로만 알고있어  
	private double normal;
	@Value("${overWeight}")
	private double overWeight;
	@Value("${obesity}")
	private double obesity;
	
	public void bmiCalculation(double weight, double height) {
		double h = height * 0.01;
		double result = weight / (h * h);
		
		System.out.printf("당신의 BMI 지수 : %.2f \n", result);
		
		if(result > obesity) 
			System.out.println(" [ 당신은 비만 판정입니다. ] ");
		else if(result > overWeight) 
			System.out.println(" [ 당신은 과체중 판정입니다. ] ");
		else if(result > normal) 
			System.out.println(" [ 당신은 정상체중 판정입니다. ] ");
		else 
			System.out.println(" [ 당신은 저체중 판정입니다. ] ");
			
		
	}
	
}
