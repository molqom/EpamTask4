package by.epam.task4.logic;

import by.epam.task4.data.Array;

public class FinderImpl implements Finder {
    @Override
    public Array findPrimeNumbers(Array array) {
        Array primeNumbers = new Array();
        for (int i = 0; i < array.length(); i++) {
            if (isPrime(array.get(i))) {
                primeNumbers.add(array.get(i));
            }
        }
        return primeNumbers;
    }

    private boolean isPrime(int number) {
        if (number < 2){
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i < (int) (Math.sqrt(number)) + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
