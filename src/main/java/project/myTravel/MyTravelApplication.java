package project.myTravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})//exclude : db연결 전까지만 사용 연결후 코드 삭제 필요
public class MyTravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTravelApplication.class, args);
	}

}
