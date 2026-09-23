import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int a = random.nextInt(10);
        char b= PLANET_CLASSES[a];
        return b;
    }

    String randomShipRegistryNumber() {
        int a = 1000 + random.nextInt(9000);
        String b = "NCC-"+a;
        return b;
    }

    double randomStardate() {
        double a= 41000.0 + 1000.0 * random.nextDouble();
        return a;
    }
}
