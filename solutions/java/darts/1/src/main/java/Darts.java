class Darts {
    int score(double xOfDart, double yOfDart) {
        int score =0;
        float x2 = (float) Math.pow(xOfDart, 2);
        float y2 = (float) Math.pow(yOfDart, 2);
        if(x2+y2>25 && x2+y2<=100){
            return 1;
        }else if(x2+y2>1 && x2+y2<=25){
            return 5;
        }else if(x2+y2>=0 && x2+y2<=1 ){
            return 10;
        }else{
            return 0;
        }
    }
}
