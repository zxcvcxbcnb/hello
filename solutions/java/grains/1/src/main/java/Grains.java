import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if(square<1 || square>64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }else{
        BigInteger a = BigInteger.valueOf(2).pow(square-1);
        return a;
        }
    }

    BigInteger grainsOnBoard() {
        BigInteger b= BigInteger.ZERO;
        for(int i=0;i<64;i++){
            b =b.add(BigInteger.valueOf(2).pow(i));
        }
        return b;
    }

}
