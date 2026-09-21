public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double a= daysSkipped<5 ? 1 : 0.85;
        return a;
    }

    public int bonusMultiplier(int productsSold) {
        int b = productsSold>19 ? 13 : 10;
        return b;
    }

    public double bonusForProductsSold(int productsSold) {
        int c = productsSold>19 ? (13*productsSold) : (10*productsSold);
        return c;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double d = daysSkipped<5 ? 1 : 0.85;
        double e = d*1000;
        int f  = productsSold>19 ? (13*productsSold) : (10*productsSold);
        double g = (e+f);
        double  h = g>1999 ? 2000 : g;
        return h;
    } 
}
