class ResistorColorTrio {
    String[] COLORS = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    String[] dan = {" ohms"," kiloohms"," megaohms"," gigaohms"};
    String label(String[] colors) {
        double a=0;
        double b=0;
        String c=null;
        double f=0;
        int g=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<COLORS.length;j++){
                if(colors[i].equals(COLORS[j])){
                    if(i==0 ){
                        a=j;
                       
                    }else {
                        b=j;
                      
                    }
                }
            }
        }
        for(int k=0;k<COLORS.length;k++){
            if(colors[2].equals(COLORS[k])){
                if(k==0){
                    f=1;
                    g=0;
                    c=dan[g];
                }else if((k>0) &&  (k<3)){
                    f=Math.pow(10,k);
                    g=0;
                    c=dan[g];
                }else if(k==3){
                    f=1;
                    g=1;
                    c=dan[g];
                }else if((k>3) && (k<6)){
                    f=Math.pow(10,k-3);
                    g=1;
                    c=dan[g];
                }else if(k==6){
                    f=1;
                    g=2;
                    c=dan[g];
                }else if(k>5 && k<9){
                    f=Math.pow(10,k-6);
                    g=2;
                    c=dan[g];
                }else{
                    f=1;
                    g=3;
                    c=dan[g];
                }
            }
        }
        int e=(int)((a*10+b)*f);
        if(e%1000==0 && e!=0){
            e=e/1000;
            g=g+1;
            c=dan[g];
        }
        String d=String.valueOf(e);
        return d.concat(c);
    }
}
