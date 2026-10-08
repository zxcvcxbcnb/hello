import java.util.List;
import java.util.ArrayList;
class DnDCharacter {
        private final int strength;
        private final int dexterity;
        private final int constitution;
        private final int intelligence;
        private final int wisdom;
        private final int charisma;

        DnDCharacter() {
            strength = ability(rollDice());
            dexterity = ability(rollDice());
            constitution = ability(rollDice());
            intelligence = ability(rollDice());
            wisdom = ability(rollDice());
            charisma = ability(rollDice());
        }
    int ability(List<Integer> scores) {
        //接收 4 次掷骰结果，去掉最小值，把剩余 3 个相加，得到一项能力值
        int a=scores.get(1);
        int min=0;
        for(int i=1;i<4;i++){
            if(a>scores.get(i)){
                a=scores.get(i);
                min=i;
            }
        }
        List<Integer> copy = new ArrayList<>(scores);
        copy.remove(min);
        int all=0;
        for(int i=0;i<3;i++){
            all=all+copy.get(i);
        }
        return all;
    }

    List<Integer> rollDice() {
        //返回 4 个 1～6 的随机整数
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<4;i++){
            int a = (int)(Math.random()*6+1);
            list.add(a);
        }
        return list;
    }

    int modifier(int input) {
        //根据能力值计算修正值
        return  (int)Math.floor((input-10)/2.0);
    }

    int getStrength() {
        //返回力量值
        return strength;
        
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }
}
