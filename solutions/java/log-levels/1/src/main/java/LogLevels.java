public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.split(":",2);
        return arr[1].trim();
        
        
    }

    public static String logLevel(String logLine) {
        String[] arr = logLine.split(":",2);
        if(arr[0].equals("[ERROR]")){
        
        return (arr[0].substring(1,6)).toLowerCase();
        }else if(arr[0].equals("[WARNING]")){
        
        return (arr[0].substring(1,8)).toLowerCase();    
        }else{
        
        return (arr[0].substring(1,5)).toLowerCase();     
        }
    }

    public static String reformat(String logLine) {
        String[] arr = logLine.split(":",2);
        if(arr[0].equals("[ERROR]")){
        String b= (arr[1].trim()).concat(" "+"(error)");
        return b;
        }else if(arr[0].equals("[WARNING]")){
        String c= (arr[1].trim()).concat(" "+"(warning)");
        return c;    
        }else{
         String d= (arr[1].trim()).concat(" "+"(info)");
        return d;   
        }
    }
}
