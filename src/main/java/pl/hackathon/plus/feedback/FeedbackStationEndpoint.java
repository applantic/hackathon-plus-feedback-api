package pl.hackathon.plus.feedback;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.hackathon.plus.feedback.domain.FeedbackStation;
import pl.hackathon.plus.feedback.domain.FeedbackStationFacade;
import pl.hackathon.plus.feedback.dto.FeedbackStationDto;

@RestController
@RequestMapping("/v1/feedback")
@AllArgsConstructor
class FeedbackStationEndpoint {

    @Autowired
    FeedbackStationFacade feedbackStationFacade;

    @GetMapping
    public Page<FeedbackStation> findAllFeedbacks(Pageable pageable) {
        return feedbackStationFacade.findAllFeedbacks(pageable);
    }

    @PostMapping
    public void saveFeedback(FeedbackStationDto feedbackStation) {
        feedbackStationFacade.saveFeedback(feedbackStation);
    }

}
