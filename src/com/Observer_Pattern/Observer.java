package com.Observer_Pattern;

/**
 * Created by thomas_young on 5/18/16.
 */
// The Observers update method is called when the Subject changes

public interface Observer {

    public void update(double ibmPrice, double aaplPrice, double googPrice);

}