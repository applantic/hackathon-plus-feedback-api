package pl.hackathon.plus.feedback.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum FeedbackType {
    KASA_EXIST("KASA_EXIST");

    private String type;
}
