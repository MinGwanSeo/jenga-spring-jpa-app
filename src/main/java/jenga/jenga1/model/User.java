package jenga.jenga1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

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

    @Column(name = "user_name")
    private String userName;

    @Column(name = "avatar_u")
    private String avatarUrl;

    @Column(name = "commit_score")
    private int commitScore;

    @Column(name = "issue_score")
    private int issueScore;

    @Column(name = "follower_score")
    private int followerScore;

    @Column(name = "overall_score")
    private int overallScore;

}
