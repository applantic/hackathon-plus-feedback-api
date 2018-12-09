package pl.hackathon.plus.feedback.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import pl.hackathon.plus.feedback.dto.FeedbackStationDto;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Transactional
public class FeedbackStationFacade {
    private FeedbackStationRepository feedbackStationRepository;

    public Page<FeedbackStation> findAllFeedbacks(Pageable pageable) {
        return feedbackStationRepository.findAll(pageable);
    }

    public void saveFeedback(FeedbackStationDto feedbackStation) {
        feedbackStationRepository.save(new FeedbackStation(feedbackStation));
    }
}
