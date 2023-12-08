package com.bittercode.service;

import javax.servlet.http.HttpSession;

import com.bittercode.model.StoreException;
import com.bittercode.model.User;
import com.bittercode.model.UserRole;

public interface UserService {

    public User login(UserRole role, String email, String password, HttpSession session) throws StoreException;

    public String register(UserRole role, User user) throws StoreException;

    public boolean isLoggedIn(UserRole role, HttpSession session);

    public boolean logout(HttpSession session);

}
