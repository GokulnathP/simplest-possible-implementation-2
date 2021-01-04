package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if(number == 2) {
            primeFactors.add(number);
        }
        return primeFactors;
    }
}
