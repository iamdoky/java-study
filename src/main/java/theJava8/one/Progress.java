package theJava8.one;

import lombok.*;

import java.time.Duration;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Progress {
    private Duration studyDuration;
    private boolean finished;
}
