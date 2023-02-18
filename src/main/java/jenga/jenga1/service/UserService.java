package jenga.jenga1.service;

import jenga.jenga1.dto.UserDTO;
import org.springframework.stereotype.Service;

public interface UserService {
    UserDTO getUser(String userName);

}
