package jenga.jenga1.dto;

import jenga.jenga1.model.Badge;
import jenga.jenga1.model.User;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserDTO {
    private long id;
    private String userName;
    private String avatarUrl;
    private int commitScore;
    private int issueScore;
    private int followerScore;
    private int overallScore;

    public User toEntity() {
        return User.builder()
                .id(id)
                .userName(userName)
                .avatarUrl(avatarUrl)
                .commitScore(commitScore)
                .issueScore(issueScore)
                .followerScore(followerScore)
                .overallScore(overallScore)
                .build();
    }
}
