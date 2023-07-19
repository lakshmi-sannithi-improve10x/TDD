package com.improve10x.fibonacci.stringcheckingending;

public class StringCheckingEnding {

    public boolean findSuffix(String originalText, String suffix) {
        String word = originalText + suffix;
        if (word == null){
            return false;
        } else if (word == "") {
            return true;
        }else if (originalText.endsWith(suffix)){
            return true;
        }else {
            return false;
        }
    }
}
