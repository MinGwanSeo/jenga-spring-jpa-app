package jenga.jenga1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Badge {

    @Id @GeneratedValue
    private Long badge_id;

    private String name;
    private String image_url;

}
