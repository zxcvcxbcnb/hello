public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if(0<speed && speed<5){
            double a = speed * 221; 
            return a;
        }else if(4<speed && speed<9){
            double b = speed * 221 * 0.9; 
            return b;
        }else if(speed ==9){
            double c = speed * 221 * 0.8; 
            return c;
        }else{
            double d = speed * 221 * 0.77; 
            return d;
        }
    }

    public int workingItemsPerMinute(int speed) {
        if(0<speed && speed<5){
            int e = (speed * 221)/60; 
            return e;
        }else if(4<speed && speed<9){
            int f = (int)((speed * 221 * 0.9)/60.0); 
            return f;
        }else if(speed ==9){
            int g = (int)((speed * 221 * 0.8)/60.0); 
            return g;
        }else{
            int h = (int)((speed * 221 * 0.77)/60);
            return h;
        }
    }
}
