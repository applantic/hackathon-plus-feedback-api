package pl.hackathon.plus.feedback.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class FeedbackStationConfiguration {

    @Bean
    FeedbackStationFacade feedbackStationFacade(FeedbackStationRepository feedbackStationRepository) {
        return new FeedbackStationFacade(feedbackStationRepository);
    }
}
