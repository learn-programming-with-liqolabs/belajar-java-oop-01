package com.liqolabs.swing.logincase;

import com.liqolabs.swing.logincase.view.LoginViews;

import javax.swing.*;
import java.awt.*;

/**
 * @author Apriliansyah Idris
 */
public class RunApp {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            var loginViews = new LoginViews("Simple Login App");
            loginViews.setMinimumSize(new Dimension(300, 150));
            loginViews.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            loginViews.setLocationRelativeTo(null);
            loginViews.pack();
            loginViews.setVisible(true);
        });

    }

}
