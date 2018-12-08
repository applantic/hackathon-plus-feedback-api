package pl.hackathon.plus.feedback.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.hackathon.plus.feedback.type.FeedbackType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FeedbackStationDto {
    private FeedbackType type;
    private Boolean occurred;
    private String stationName;
    private String postalCode;
}
