package collatzconjecture;

// Warning: This class cannot guarantee termination

/**
 *
 * @author Derek
 */
public abstract class RecursiveFunction<T extends Comparable> {

    protected FunctionPath<T> pathData;
    
    public RecursiveFunction(T seed, T end) {
        pathData = new FunctionPath(seed);
        while (seed != end) {
            seed = function(seed);
            pathData.append(seed);
        }
    }
    
    protected abstract T function(T cur);
    
    public FunctionPath<T> getPath() {
        return pathData;
    }
}
