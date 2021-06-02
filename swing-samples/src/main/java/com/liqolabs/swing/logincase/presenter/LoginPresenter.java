package com.liqolabs.swing.logincase.presenter;

import com.liqolabs.swing.logincase.view.LoginView;

/**
 * @author Apriliansyah Idris
 */
public class LoginPresenter {

    private final LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
    }

    public void loginIt(String username, String password) {
        if (username.equals("root") && password.equals("123456")) {
            view.showMassage("Login Success");
        } else view.showMassage("Login Failed");
    }

}
