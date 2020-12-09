package Main;

public class Cube implements GeometricBody {
    public double Length;

    public Cube(double length){
        Length=length;
    }

    @Override
    public double getSurface(){
        return 6*Length*Length;
    }

    @Override
    public double getVolume(){
        return Length*Length*Length;
    }
}
