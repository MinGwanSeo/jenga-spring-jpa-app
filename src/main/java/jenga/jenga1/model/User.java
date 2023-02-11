package jenga.jenga1.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long user_id;
    private String avatar_url;
    private int commit_score;
    private int issue_score;
    private int follow_score;
    private int overall_score;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate start_commit_date;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate registered_date;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate updated_date;
}
