public class Multiple {

    public int of(int number) {
        return number > -1 ? processInterval(number) : 0;
    }

    private int processInterval(int number) {
        int adder = 0;
        for (int i = 1; i <= number; i++) {
            if(isMultiple(i)) adder += i;
        }
        return adder;
    }

    private boolean isMultiple(int number) {
        return number % 3 == 0 || number % 5 == 0;
    }

}
