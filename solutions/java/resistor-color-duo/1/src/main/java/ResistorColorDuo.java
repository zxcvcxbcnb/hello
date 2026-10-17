class ResistorColorDuo {
     String[] COLORS = {
        "black", "brown", "red", "orange", "yellow",
        "green", "blue", "violet", "grey", "white"
    };
    
    int value(String[] colors) {
        String a1=colors[0];
        String a2=colors[1];
        String[] colors1 = {a1,a2};
        int a=0;
        int b=0;
        for(int i=0;i<colors1.length;i++){
            for(int o=0;o<COLORS.length;o++){
                if(COLORS[o].equals(colors1[i])){
                    if(i==0){
                        a=o;
                    }else {
                        b=o;
                    }    
                }
            }
            
        }
        return ((a*10)+b);
        
    }
}
