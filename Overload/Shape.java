package it.develhope.Overload;

public class Shape {
    public String shapeName;
    public int numberOfEdges;


    //Created object
    public Shape() {
        System.out.println("The object is created");
        shapeName = "Undefined shape";
    }

    public Shape(double radius) {
        System.out.println("The circle is created");
        this.shapeName = "Circle";

    }

    public Shape(double edgeLenght, int edge) {
        System.out.println("The square is created");
        this.shapeName = "Square";
        this.numberOfEdges = edge;
    }

    public Shape(int edge, double e1, double e2) {
        System.out.println("The rectangle is created");
        this.shapeName = "Rectangle";
        this.numberOfEdges = edge;
    }

    public Shape(int edge, double e1, double e2, double e3) {
        System.out.println("The trianlge is created");
        this.shapeName = "Triangle";
        this.numberOfEdges = edge;
    }

    public String getShapeDetails(){
        return (shapeName + " " + "-- Edges " + numberOfEdges);
    }

}





