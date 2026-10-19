class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int n=(input*(input+1))/2;
        return n*n;
    }

    int computeSumOfSquaresTo(int input) {
        int n =input;
        return (n*(n+1)*((2*n)+1))/6;
    }

    int computeDifferenceOfSquares(int input) {
        int a=(input*(input+1))/2;
        int d =a*a;
        int b=input;
        int c=(b*(b+1)*((2*b)+1))/6;
        int e=d-c;
        return e;
    }

}
