package jenga.jenga1.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

public class UserBadge {

    @Id @GeneratedValue
    private Long user_badge_id;

    @JoinColumn
    private Long user_id;

    @JoinColumn
    private Long badge_id;
}
