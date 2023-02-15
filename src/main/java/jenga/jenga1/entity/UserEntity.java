package jenga.jenga1.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(length = 100, nullable = false)
    private String user_name;

    @Column(length = 255, nullable = false)
    private String avatar_url;

    @Column(nullable = false)
    private int commit_score;

    @Column(nullable = false)
    private int issue_score;

    @Column(nullable = false)
    private int follow_score;

    @Column(nullable = false)
    private int overall_score;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate start_commit_date;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate registered_date;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate updated_date;
}
