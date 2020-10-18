package org.webapp.Service;

import org.webapp.model.UserModel;

import java.util.Set;

public interface UserService {
    Set<UserModel> getAll();

    UserModel getUserByPath(int userId);

    UserModel getUserByParam(int userId);

    boolean addUser(UserModel userModel);

    UserModel editUser(UserModel userModel);

    boolean removeUserById(int userId);
}
