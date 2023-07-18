package com.improve10x.fibonacci.perimeterofrectangle;

public class PerimeterOfRectangle {
    public int findPerimeterOfRectangle(int l, int w) {
        int lengthAndWidth = l + w;
        if (lengthAndWidth<0){
            return  -1;
        }else {
            int result = 2 * (l + w);
            return result;
        }
    }
}
