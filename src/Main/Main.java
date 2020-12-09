package Main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<GeometricBody> bodies=new ArrayList<GeometricBody>();
        GeometricBodyController bodyController=new GeometricBodyController();

        bodies.add(new Cube(5));
        bodies.add(new Sphere(8));
        bodies.add(new Parallelipiped(6,4, 2));

        GeometricBody biggestSurface=bodyController.getBiggestSurface(bodies);
        System.out.println("Biggest Surface: "+biggestSurface.getClass().getSimpleName()+" is "+biggestSurface.getSurface());
        GeometricBody biggestVolume=bodyController.getBiggestVolume(bodies);
        System.out.println("Biggest Volume: "+biggestVolume.getClass().getSimpleName()+" is "+biggestVolume.getVolume());

    }
}
