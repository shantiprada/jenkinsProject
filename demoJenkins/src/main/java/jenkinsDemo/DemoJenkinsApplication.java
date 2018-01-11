package jenkinsDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
//@ComponentScan(basePackages = { "controllers.MainController"})
@Controller
public class DemoJenkinsApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Greetings from Java Tutorial Network";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJenkinsApplication.class, args);
	}
}
