package Main;

public class Parallelipiped implements GeometricBody {
    public double Length;
    public double Width;
    public double Height;

    public Parallelipiped(double length, double width, double height){
        Length=length;
        Width=width;
        Height=height;
    }

    @Override
    public double getSurface(){
        return 2*Height*(Width+2*Length);
    }

    @Override
    public double getVolume(){
        return Length*Width*Height;
    }
}
