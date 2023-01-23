package is.hi.hbv501g.flightplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FlightPlannerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightPlannerApplication.class, args);
    }

}
