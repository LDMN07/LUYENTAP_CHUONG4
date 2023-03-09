class Shape {
    protected String Color;
    protected Boolean Filled;
    
    public Shape(String Color, Boolean Filled) {
        this.Color = Color;
        this.Filled = Filled;
    }
    public String getColor(){
        return this.Color;
    }
    public void setColor() {
        this.Color ="red";
    }
    public Boolean isFilled() {
        return this.Filled;
    }
    public void setFilled() {
        this.Filled = Filled;
    }
}
class Circle extends Shape {
    protected Double radius;
    
    public Circle(String Color, Boolean Filled, Double radius, Double Area, Double Perimeter) {
       super(Color, Filled);
       this.radius = radius;
       this.Area = Area;
       this.Perimeter = Perimeter;
    }
    public Double getradius() {
        return this.radius;
    }
    public void setradius() {
        this.radius = radius;
    }
    public Double getArea() {
        return this.Area;
    }
    public Double getPerimeter() {
        return this.Perimeter;
    }
}
class Rectangle extends Shape {
    protected Double width;
    protected Double length;
    
    public Rectangle(String Color, Boolean Filled, Double width, Double length) {
        super(Color, Filled);
        this.width = width;
        this.length = length;
    }
    public Double getwidth() {
        return this.width;
    }
    public void setwidth() {
        this.width = 1.0;
    }
    public Double getlength() {
        return this.length;
    }
    public void setlength() {
        this.length = 1.0;
    }
     public Double getArea() {
        return this.Area;
    }
    public Double getPerimeter() {
        return this.Perimeter;
    }
}
class Square extends Rectangle {
    protected Double Side;
    
    public Square(String Color, Boolean Filled, Double Side){
        super(Color, Filled);
        this.Side = Side;
    }
    public Double getSide() {
        return this.Side;
    }
    public void setSide() {
        this.Side = Side;
    }
}
class Main {
    public static void main(String [] args){
    }
}

