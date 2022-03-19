package com.weeklyassignment2;

public abstract class shapes {
    abstract void RectangleArea(float l,float b);
    abstract void SquareArea(int s);
    abstract void CircleArea(double r);


}
class Area extends shapes{
    void RectangleArea(float l, float b){
        double arearectangle=(l*b);
        System.out.println(arearectangle);
    }
    void SquareArea(int s) {
        int areasquare = s * s;
        System.out.println(areasquare);
    }
    void CircleArea(double r){
        double circlearea=(22*r*r)/7;
        System.out.println(circlearea);

    }

    public static void main(String[] args) {
        Area a=new Area();
        System.out.println("Area of rectangle:" );
        a.RectangleArea(4,9);
        System.out.println("Area of Square:");
        a.SquareArea(9);
        System.out.println("Area of Circle:");
        a.CircleArea(10);
    }
}

