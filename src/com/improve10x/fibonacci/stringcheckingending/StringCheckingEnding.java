package com.improve10x.fibonacci.stringcheckingending;

public class StringCheckingEnding {
    public boolean findSuffix(String originalText, String suffix) {
        originalText = "abc";
        suffix = "bc";
        if (originalText.endsWith(suffix)){
            return true;
        }else {
            return false;
        }
    }
}
