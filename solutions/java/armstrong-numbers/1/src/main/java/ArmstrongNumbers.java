class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int i=0;
        int a=numberToCheck;
        int d=numberToCheck;
        do{
            a=a/10;
            i++;
        }while(a>0);
       
        int[] arr= new int[i];
        for(int j=0;j<arr.length;j++){
            
            arr[j]=numberToCheck%10;
            numberToCheck=numberToCheck/10;
        }
        int c=0;
        for(int b=0;b<arr.length;b++){
            c += (int) Math.pow(arr[b], arr.length);
        }
        if(c==d){
            return true;
        }else{
            return false;
        }

    }

}
