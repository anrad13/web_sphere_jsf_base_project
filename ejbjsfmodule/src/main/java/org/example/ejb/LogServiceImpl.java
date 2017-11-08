package org.example.ejb;

import javax.ejb.Stateless;
import java.io.Serializable;

@Stateless
public class LogServiceImpl implements LogService, Serializable {

    public void log(String s) {
        System.err.println(" " +s);
    }


    public String apply() {
        return "This is " + this.getClass().getName();
    }
}
