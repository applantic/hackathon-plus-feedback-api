package pl.hackathon.plus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZoneOffset;

@SpringBootApplication
public class FeedbackStationApp {
	public static final ZoneOffset DEFAULT_ZONE_OFFSET = ZoneOffset.UTC;


	public static void main(String[] args) {
		SpringApplication.run(FeedbackStationApp.class, args);
	}
}
