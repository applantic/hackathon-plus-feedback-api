package pl.hackathon.plus.feedback.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.hackathon.plus.feedback.dto.FeedbackStationDto;

import java.util.List;

@Configuration
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackStationFacade {
    private FeedbackStationRepository feedbackStationRepository;

    public Page<FeedbackStationDto> findAllFeedbacks(Pageable pageable) {
        Page<FeedbackStation> feedbackStations = feedbackStationRepository.findAll(pageable);
        return feedbackStations.map(FeedbackStation::dto);
    }

    public void saveFeedback(FeedbackStationDto feedbackStation) {
        feedbackStationRepository.save(new FeedbackStation(feedbackStation));
    }
}
