package mx.emmanuel.classicmodels;

import mx.emmanuel.classicmodels.services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class ClassicmodelsApplication {
	private static final Logger logger = LoggerFactory.getLogger(ClassicmodelsApplication.class);

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = SpringApplication.run(ClassicmodelsApplication.class, args)) {

			EmployeeService employeeService = context.getBean(EmployeeService.class);
			List<String> allNames = employeeService.getAllNames();
			for (String name : allNames) {
				logger.info(name);
			}

		}
	}

}
