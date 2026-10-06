import java.util.Map;
import java.util.HashMap;
public class DialingCodes {
    Map<Integer, String> fruitPrices = new HashMap<>();
    public Map<Integer, String> getCodes() {
        
        return fruitPrices;
    }

    public void setDialingCode(Integer code, String country) {
        fruitPrices.put(code,country);
    }

    public String getCountry(Integer code) {
        return fruitPrices.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if( !fruitPrices.containsKey(code) && !fruitPrices.containsValue(country)){
            fruitPrices.put(code,country);
        }
    }

    public Integer findDialingCode(String country) {
        for(Map.Entry<Integer, String> map:fruitPrices.entrySet()){
                if(map.getValue().equals(country)){
                    return map.getKey();
          }
            
    }
        return null; 
}

    public void updateCountryDialingCode(Integer code, String country) {
        for(Map.Entry<Integer,String> map:fruitPrices.entrySet() ){
            if(map.getValue().equals(country)){
                fruitPrices.remove(map.getKey());
                fruitPrices.put(code,country);
            }
        }
    }
        
    
}
