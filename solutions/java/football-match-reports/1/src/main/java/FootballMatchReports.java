public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String b=null;
        switch(shirtNum){
            case 1:
                b = "goalie";
                break;
            case  2:
                b = "left back";
                break;
            case 3 :
               b = "center back";
                break;
            case 4:
                b = "center back";
                break;
            case 5:
                 b = "right back";
                break;
            case 6:
                 b = "midfielder";
                break;
            case 7:
                 b = "midfielder";
                break;
            case 8:
                 b = "midfielder";
                break;
            case 9:
                 b = "left wing";
                break;
            case 10:
                 b = "striker";
                break;
            case 11:
                 b = "right wing";
                break;
            default:
                 b = "invalid";
                break;
        }
        return b;
    }
}
