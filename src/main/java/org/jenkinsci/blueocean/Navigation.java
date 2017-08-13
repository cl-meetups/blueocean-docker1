package org.jenkinsci.blueocean;

public class Navigation {
    public String navigate(String where){
        return String.format("Navigating to: %s", where);
    }
}
