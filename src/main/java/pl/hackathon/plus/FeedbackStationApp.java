package pl.hackathon.plus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import java.time.ZoneOffset;

@SpringBootApplication
@EnableSpringDataWebSupport
public class FeedbackStationApp {
	public static final ZoneOffset DEFAULT_ZONE_OFFSET = ZoneOffset.UTC;


	public static void main(String[] args) {
		SpringApplication.run(FeedbackStationApp.class, args);
	}
}
