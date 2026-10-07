class ReverseString {

    String reverse(String inputString) {
        char[] arr = inputString.toCharArray();
        char a= 'a';
        int b=0;
        int c=0;
        for(b=0,c=arr.length-1;b<c;b++,c--){
            a=arr[b];
            arr[b]=arr[c];
            arr[c]=a;
        }
        return new String(arr);
    }
  
}
