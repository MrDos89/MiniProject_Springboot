package himedia.myrestserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(value= {"miniproject01.streamerlist.mapper"})
@SpringBootApplication
@ComponentScan(basePackages= {"himedia.myrestserver", "miniproject01.streamerlist"})
public class MiniProject01Application {

	public static void main(String[] args) {
		SpringApplication.run(MiniProject01Application.class, args);
	}

}
