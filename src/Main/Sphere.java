package Main;

public class Sphere implements GeometricBody{
    public double Radius;

    public Sphere(double radius){
        Radius=radius;
    }

    @Override
    public double getSurface(){
        return 4*Math.PI*Radius*Radius;
    }

    @Override
    public double getVolume(){
        return 4/3*Math.PI*Radius*Radius*Radius;
    }
}
