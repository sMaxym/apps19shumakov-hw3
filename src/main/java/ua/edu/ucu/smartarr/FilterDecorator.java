package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.HashSet;
import java.util.Set;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    protected static String DESC = "filtering";

    public FilterDecorator(SmartArray smartArray, MyPredicate pr) {
        super(smartArray);

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public String operationDescription() {
        return FilterDecorator.DESC;
    }

    @Override
    public int size() {
        return 0;
    }
}
