package jenga.jenga.service.impl;

import jenga.jenga.model.User;
import jenga.jenga.dto.UserDTO;
import jenga.jenga.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.UserDataHandler;

@Service
public class UserServiceImpl implements UserService {

    UserDataHandler userDataHandler;

    @Autowired
    public UserServiceImpl(UserDataHandler userDataHandler) {
        this.userDataHandler = userDataHandler;
    }



    @Override
    public UserDTO getUser(String userName) {
        User user = userDataHandler
        return null;
    }
}
