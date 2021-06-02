package com.liqolabs.swing.logincase.view;

/**
 * The default interface that all View interfaces should extend.
 * The implementation of this interface allows the service to interact with the calling application
 * to retrieve data or display certain information, such as error messages and warnings.
 *
 * @author Apriliansyah Idris
 */
public interface DefaultView {

    /**
     * Called when the action occurs from a calling application
     * such as a Controller or Presenter.
     * @param m the message to be display the requested message
     */
    void showMassage(String m);

}
