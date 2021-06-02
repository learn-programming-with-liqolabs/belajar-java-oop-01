package com.liqolabs.swing.logincase.view;

import com.liqolabs.swing.logincase.presenter.LoginPresenter;

import javax.swing.*;
import java.awt.*;

/**
 * @author Apriliansyah Idris
 */
public class LoginViews extends JFrame implements LoginView {

    private JTextField textFieldUsername;
    private JPasswordField textFieldPassword;
    private JButton buttonLogin;
    private JPanel rootPanel;
    private LoginPresenter presenter;

    public LoginViews(String title) throws HeadlessException {
        super(title);
        setContentPane(rootPanel);

        addActionListener();
        createPresenter();
    }

    @Override
    public void showMassage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    private void addActionListener() {
        buttonLogin.addActionListener(a ->
                presenter.loginIt(getTextFieldUsername(), getTextFieldPassword()));
    }

    private void createPresenter() {
        presenter = new LoginPresenter(this);
    }

    public String getTextFieldUsername() {
        return textFieldUsername.getText();
    }

    public String getTextFieldPassword() {
        return String.valueOf(textFieldPassword.getPassword());
    }
}
