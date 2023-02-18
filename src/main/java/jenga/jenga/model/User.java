package jenga.jenga.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String userName;

    @Column
    private String avatarUrl;

    @Column
    private int commitScore;

    @Column
    private int issueScore;

    @Column
    private int followerScore;

    @Column
    private int overallScore;

    @OneToMany(mappedBy = "user")
    List<UsersBadge> usersBadges = new ArrayList<>();
}
