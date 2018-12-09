package pl.hackathon.plus.feedback;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.hackathon.plus.feedback.domain.FeedbackStationFacade;
import pl.hackathon.plus.feedback.dto.FeedbackStationDto;

@RestController("/feedback")
class FeedbackStationEndpoint {

    FeedbackStationFacade feedbackStationFacade;

    @GetMapping
    public Page<FeedbackStationDto> findAllFeedbacks(Pageable pageable) {
        return feedbackStationFacade.findAllFeedbacks(pageable);
    }

    @PostMapping
    public void saveFeedback(FeedbackStationDto feedbackStation) {
        feedbackStationFacade.saveFeedback(feedbackStation);
    }

}
