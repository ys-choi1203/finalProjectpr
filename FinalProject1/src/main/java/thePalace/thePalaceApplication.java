package thePalace;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("thePalace")
@MapperScan(basePackages= "thePalace.mapper")
public class thePalaceApplication {
	public static void main(String[] args) {
		SpringApplication.run(thePalaceApplication.class, args);
	}
}
