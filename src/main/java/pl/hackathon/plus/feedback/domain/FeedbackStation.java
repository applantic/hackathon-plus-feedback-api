package pl.hackathon.plus.feedback.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.hackathon.plus.feedback.type.FeedbackType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
class FeedbackStation {
    @Id @GeneratedValue private Long id;
    private FeedbackType type;
    private Boolean occurred;
    private String stationName;
    private String postalCode;
    private Date date;
}
