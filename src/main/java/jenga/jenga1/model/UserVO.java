package jenga.jenga1.model;

import org.springframework.boot.context.properties.ConstructorBinding;

import java.time.LocalDate;

public class UserVO {
    private Long id;
    private String user_name, avatar_url;
    private GithubScoreVO githubScoreVO;
    private LocalDate start_commit_date, registered_date, updated_date;
    private BadgeVO[] badgeVOS;
    private UserVO[] aroundUserVOS;

}
