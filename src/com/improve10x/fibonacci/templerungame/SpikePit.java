package com.improve10x.fibonacci.templerungame;


public class SpikePit {
    private  int width;
    public SpikePit(int width) {
        if (width<0 || width>20){
            throw new InvalidSpikePitWidthException();
        }
            this.width = width;
    }

    public void trap() {
        System.out.println("SpikePit is Trapped with" + width + "meters width!");
    }

    public class InvalidSpikePitWidthException extends RuntimeException{
    }
}
