package Main;
import java.util.ArrayList;

public class GeometricBodyController {

    public GeometricBody getBiggestSurface(ArrayList<GeometricBody> list){
        if (list.size()==0){
            return null;
        }
        GeometricBody biggestSurface=list.get(0);

        for (GeometricBody body:list){
            if(body.getSurface()>biggestSurface.getSurface()){
                biggestSurface=body;
            }
        }
        return biggestSurface;
    }

    public GeometricBody getBiggestVolume(ArrayList<GeometricBody> list){
        if (list.size()==0){
            return null;
        }
        GeometricBody biggestVolume=list.get(0);

        for (GeometricBody body:list){
            if(body.getVolume()>biggestVolume.getSurface()){
                biggestVolume=body;
            }
        }
        return biggestVolume;
    }
}
