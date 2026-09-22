class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
    public String toString(){
        String a = "Fighter is a Warrior";
        return a;
    }

    boolean isVulnerable(){
        return false;
    }

    int getDamagePoints(Fighter fighter){
        if(fighter.isVulnerable()){
            return 10;
        }else{
            return 6;
        }
    }
    
}
// TODO: define the Wizard class
class Wizard extends Fighter{

    public boolean as = false;
    public String toString(){
        String b= "Fighter is a Wizard";
        return b;
    }

    public void prepareSpell (){
        as=true;
    }

    boolean isVulnerable(){
        if(as){
            return false;
        }else{
            return true;
        }
    }

    int getDamagePoints(Fighter fighter){
        if(as){
            as = false;
            return 12;
        }else{
            
            return 3;
        }
    }

    

    

    
}
