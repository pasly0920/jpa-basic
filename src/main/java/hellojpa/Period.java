package hellojpa;

import java.time.LocalDateTime;
import javax.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Period {

    public Period() {
    }

    public Period(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
