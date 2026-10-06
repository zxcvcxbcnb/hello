import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> set =new HashSet<>(cards);
        return set;
        
        
        
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
        
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()) {
        return false;
    }
         Set<String> myUniqueCards = new HashSet<>(myCollection);
         myUniqueCards.removeAll(theirCollection);

         Set<String> theirUniqueCards = new HashSet<>(theirCollection);
         theirUniqueCards.removeAll(myCollection);

         return !myUniqueCards.isEmpty() && !theirUniqueCards.isEmpty();
        
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>(collections.get(0));
   
        for(int i=1;i<collections.size();i++){
            common.retainAll( collections.get(i));
        }
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> set = new HashSet<>();
        for(Set<String> collection : collections){
            set.addAll(collection);
        }
        return set;
    }
}
