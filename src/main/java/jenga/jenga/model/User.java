package jenga.jenga.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;

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


    private ArrayList<UsersBadge> usersBadges;

}
