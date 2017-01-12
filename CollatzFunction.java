package collatzconjecture;

// Warning: This class cannot guarantee termination

import java.math.BigInteger;


/**
 *
 * @author Derek
 */
public class CollatzFunction extends RecursiveFunction<BigInteger> {
    
    private static final BigInteger TWO = new BigInteger("2");
    private static final BigInteger THREE = new BigInteger("3");
    
    public CollatzFunction(BigInteger num) {
        super(num.abs(), BigInteger.ONE);
    }
    
    @Override
    protected BigInteger function(BigInteger cur) {
        if (cur.mod(TWO) == BigInteger.ZERO) {
            return cur.divide(TWO);
        }
        else {
            return cur.multiply(THREE).add(BigInteger.ONE);
        }
    }
    
}
