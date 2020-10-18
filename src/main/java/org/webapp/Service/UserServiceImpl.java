package org.webapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.webapp.model.UserModel;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    private Set<UserModel> userList;

    @Autowired
    public UserServiceImpl(@Qualifier("userList") Set<UserModel> userList) {
        this.userList = userList;
    }

    @Override
    public Set<UserModel> getAll() {
        return userList;
    }

    @Override
    public UserModel getUserByPath(int userId) {
        for (UserModel user : userList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    @Override
    public UserModel getUserByParam(int userId) {
        for (UserModel user : userList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean addUser(UserModel userModel) {
        return userList.add(userModel);
    }

    @Override
    public UserModel editUser(UserModel userModel) {
        for (UserModel user : userList) {
            if (user.getId() == userModel.getId()) {
                userList.remove(user);
                userList.add(userModel);
//                userList.add(UserModel
//                        .builder()
//                        .id(userModel.getId())
//                        .name(userModel.getName())
//                        .email(userModel.getEmail())
//                        .password(userModel.getPassword())
//                        .build());

//                user.setName(userModel.getName());
//                user.setEmail(userModel.getEmail());
//                user.setPassword(userModel.getPassword());
                return userModel;
            }
        }
        return null;
    }

    @Override
    public boolean removeUserById(int userId) {
        for (UserModel user : userList) {
            if (user.getId() == userId) {
                return userList.remove(user);
            }
        }
        return false;
    }
}
