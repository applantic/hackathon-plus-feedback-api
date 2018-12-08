package pl.hackathon.plus.feedback.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.hackathon.plus.feedback.dto.FeedbackStationDto;
import pl.hackathon.plus.feedback.type.FeedbackType;
import pl.hackathon.plus.infrastructure.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
class FeedbackStation extends BaseEntity {
    private FeedbackType type;
    private Boolean occurred;
    private String stationName;
    private String postalCode;

    public FeedbackStationDto dto() {
        return FeedbackStationDto.builder()
                .type(type)
                .occurred(occurred)
                .stationName(stationName)
                .postalCode(postalCode)
                .build();
    }
}
