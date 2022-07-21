package sg.edu.nus.iss.d13revision;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D13revisionApplication {

	public static void main(String[] args) {
		// SpringApplication.run(D13revisionApplication.class, args);
		SpringApplication app = new SpringApplication(D13revisionApplication.class);

		String port = "8080"; // default port
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);

		if (cliOpts.containsOption("port")) {
			port = cliOpts.getOptionValues("port").get(0);
		}

		app.setDefaultProperties(Collections.singletonMap("server.port", port));
		app.run(args);

		if (port.equals("8080")) {
			System.out.println("Application has started and running on default port: [8080]");
		} else {
			System.out.printf("Application has started and running on port specified port: [%s]\n", port);
		}
	}

}
