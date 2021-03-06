package swiss.fihlon.vaadin;

import com.vaadin.flow.component.page.AppShellConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer implements AppShellConfigurator {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
