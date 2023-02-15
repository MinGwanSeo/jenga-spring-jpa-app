package jenga.jenga1.model;

import javax.persistence.*;

@Entity
@Table(name = "badge")
public class BadgeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long badge_id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 255, nullable = false)
    private String image_url;

}
