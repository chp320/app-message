package app.message.appmessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppMessageApplication.class, args);
		/*
		// HTTP 요청 처리하기 위함이 아닌 일반 자바 처리 컨테이너
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageService messageService = context.getBean(MessageService.class);
		messageService.save("Hello, Spring!");
		*/

		// HTTP 요청 처리는 이후 생성될 *Controller 에서 처리할 것임.
	}
}
