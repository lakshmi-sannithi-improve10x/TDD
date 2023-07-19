package com.improve10x.fibonacci.stringcheckingending;

public class StringCheckingEnding {

    public boolean checkingSuffix(String originalText, String suffix) {
        if (originalText == null) {
            return false;
        } else if (originalText.endsWith(suffix)) {
            return true;
        } else {
            return false;
        }
    }
}
