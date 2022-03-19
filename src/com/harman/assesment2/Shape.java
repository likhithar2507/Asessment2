package com.harman.assesment2;
public abstract class Shape {

    abstract void AreaRectangle(float l,float b);

    abstract void AreaSquare(int s);

    abstract void AreaCircle(double r);
}
class Area extends Shape{

    void AreaRectangle(float l,float b) {
        double arearec=(l*b);
        System.out.println(arearec);
    }

    void AreaSquare(int s) {
        int areasqr=s*s;
        System.out.println(areasqr);
    }

    void AreaCircle(double r) {
        double areacir=(22*r*r)/7;
        System.out.println(areacir);
    }

    public static void main(String args[]) {
        Area a=new Area();

        System.out.println("the Area of rectangle is :");
        a.AreaRectangle(9,39);

        System.out.println(" the Area of Square is :");
        a.AreaSquare(87);

        System.out.println("Area of Circle is :");
        a.AreaCircle(55);
    }
}