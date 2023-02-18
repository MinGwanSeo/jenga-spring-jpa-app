package jenga.jenga1.repository;

import jenga.jenga1.model.Badge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BadgeRepository extends JpaRepository<Badge, Long> {
}
