interface Shape {
    void draw();
}

class RoundedRectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Rounded Rectangle");
    }
}

class RoundedSquare implements Shape{
    public void draw(){
        System.out.println("Rounded Square");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle");
    }
}
class Square implements Shape{
    public void draw(){
        System.out.println("Square");
    }
}

abstract class AbstractFactory{ // because of this class dynamic binding is possible and a lot of code is reused in main
    abstract Shape getShape(String shapeType);
}

class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}

class RoundedShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }
        return null;
    }
}



class FactoryProducer{
    public static AbstractFactory getFactory(boolean rounded){ //here return type is Abstract So basically dynamic binding is occuring
        if(rounded){
            return new RoundedShapeFactory();
        }
        else{
            return new ShapeFactory();
        }
    }
}
public class FactoryImp {
    public static void main(String[] args) {
        AbstractFactory af = FactoryProducer.getFactory(true);
        af.getShape("square").draw();
        af.getShape("rectangle").draw();
        AbstractFactory afr = FactoryProducer.getFactory(false);
        afr.getShape("square").draw();
        afr.getShape("rectangle").draw();
    }
}
