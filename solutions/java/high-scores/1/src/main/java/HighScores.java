import java.util.List;
import java.util.ArrayList;
class HighScores {

    private List<Integer> highScores;
    public HighScores(List<Integer> highScores) {
        this.highScores=highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size()-1);
    }

    Integer personalBest() {
        int a=highScores.get(0);
        for(int i =1;i<highScores.size();i++){
            if(a<highScores.get(i)){
                a=highScores.get(i);
            }
        }
        return a;
    }

    List<Integer> personalTopThree() {
        if(highScores.size()<4){
            List<Integer> list4 = new ArrayList<>(highScores);
            List<Integer> list3= new ArrayList<>();
            
            for(int i1=0;i1<3  && !list4.isEmpty();i1++){
                int d=list4.get(0);
                for(int h =1;h<list4.size();h++){
                    if(d<list4.get(h)){
                        d=list4.get(h);    
                    }
                    
                }
                list3.add(d);
                list4.remove(Integer.valueOf(d));
                
            }
            return list3;
        }else{
            List<Integer> list2= new ArrayList<>();
            List<Integer> list= new ArrayList<>(highScores);
            int c=list.get(0);
            for(int i=0;i<3;i++){
                for(int g =1;g<list.size();g++){
                    if(c<list.get(g)){
                        c=list.get(g);    
                    }
                }
                list2.add(c);
                list.remove(Integer.valueOf(c));
                 c=list.get(0);
            }
            return list2;
            
        }
    }

}
