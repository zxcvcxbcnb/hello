public class GameMaster {
    public String describe(Character character){
        String CharacterClass= character.getCharacterClass();
        int level = character.getLevel();
        int hitPoints = character.getHitPoints();

        String a = "You're a level "+level+" "+CharacterClass+" with "+hitPoints+" hit points.";
        return a;
        
    }
    // TODO: define a 'describe' method that returns a description of a Character
    public String describe(Destination destination){
        String name = destination.getName();
        int inhabitants =destination.getInhabitants();

        String a = "You've arrived at "+name+", which has "+ inhabitants + " inhabitants.";
        return a;
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public String describe(TravelMethod travelMethod){
        if(travelMethod == TravelMethod.WALKING){
            return "You're traveling to your destination by walking.";
        }else{
            return "You're traveling to your destination on horseback.";
        }
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public String describe(Character character,Destination destination,TravelMethod travelMethod){
        String CharacterClass= character.getCharacterClass();
        int level = character.getLevel();
        int hitPoints = character.getHitPoints();
        String name = destination.getName();
        int inhabitants =destination.getInhabitants();
        if(travelMethod == TravelMethod.WALKING){
            return "You're a level "+level+" "+CharacterClass+" with "+hitPoints+" hit points."+"You're traveling to your destination by walking."+"You've arrived at "+name+", which has "+ inhabitants + " inhabitants.";
        }else{
            return "You're a level "+level+" "+CharacterClass+" with "+hitPoints+" hit points."+" You're traveling to your destination on horseback."+" You've arrived at "+name+", which has "+ inhabitants + " inhabitants.";
        }
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character,Destination destination){
        String CharacterClass= character.getCharacterClass();
        int level = character.getLevel();
        int hitPoints = character.getHitPoints();
        String name = destination.getName();
        int inhabitants =destination.getInhabitants();
        return "You're a level "+level+" "+CharacterClass+" with "+hitPoints+" hit points."+" You're traveling to your destination by walking. "+"You've arrived at "+name+", which has "+ inhabitants + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
}
