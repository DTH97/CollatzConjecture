package collatzconjecture;

import java.util.LinkedList;

/**
 *
 * @author Derek
 */
public class FunctionPath<T extends Comparable> {
    
    private T maximumElement;
    private LinkedList<T> recursionPath;

    public FunctionPath() {
        recursionPath = new LinkedList();
        maximumElement = null;
    }
    
    public FunctionPath(T elem) {
        recursionPath = new LinkedList();
        maximumElement = elem;
        recursionPath.add(elem);
    }
    
    public FunctionPath(LinkedList<T> rp) {
        if (rp == null) {
            throw new NullPointerException();
        }
        recursionPath = rp;
        maximumElement = rp.getFirst();
        for(T elem: rp) {
            if(elem.compareTo(maximumElement) > 0 ) {
                maximumElement = elem;
            }
        }
    }
    
    public T getMax() {
        if (maximumElement == null) {
            throw new NullPointerException();
        }
        return maximumElement;
    }
    
    public LinkedList<T> getPath() {
        return recursionPath;
    }
    
    public void append(T elem) {
        recursionPath.add(elem);
        if(elem.compareTo(maximumElement) > 0 ) {
            maximumElement = elem;
        }
    }
    
    
}
