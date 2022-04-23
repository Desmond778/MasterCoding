public class TestBigO {
    public static void main(String[] args) {

    }

    private static void log(int[] numbers, String[] names) {
        //Order of something
        /** Cost of the algorithm
            O(1) - Runtime Complexity - run in constant time
         * */
        System.out.println(numbers[0]);

        /**
            O(2) -> O(1)
         */
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);

        /**
            O(n) -> cost of this operation grows linearly
        */
         for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
         /**
            O(1 + n + 1) -> O(2+n) -> O(n) -> if n is million there is no impact of 2 (constants)
          */
        System.out.println(); // O(1)
        for (int number: numbers) { // O(n)
            System.out.println(number);
        }
        System.out.println(); // O(1)


        /**
         * O(n + n) -> O(2n) ->O(n) -> represents a liner growth
         */
        for (int number: numbers) { // O(n)
            System.out.println(number);
        }
        for (int number: numbers) { // O(n)
            System.out.println(number);
        }

        /**
         * O(n + m) -> O(n) -> represents a linear growth (runtime complexity increases linearly)
         */
        for (int number: numbers) { // O(n)
            System.out.println(number);
        }
        for (String name: names) { // O(m)
            System.out.println(name);
        }

        /**
         * O(n * n) -> O(n^2)
         */
        for (int first: numbers)  // O(n)
            for (int second: numbers)  // O(n)
                System.out.println(first + ", " + second);

        /**
         * O(n + n^2) -> O(n^2)
         */
        for (int number: numbers)  // O(n)
            System.out.println(number);
        for (int first: numbers)  // O(n)
            for (int second: numbers)  // O(n)
                System.out.println(first + ", " + second);

        /**
         * O(n^3) -> O(n^3) -> (n^2) and (n) can be dropped
         */
        for (int first: numbers)  // O(n)
            for (int second: numbers)  // O(n)
                for (int third: numbers)  // O(n)
                    System.out.println(first + ", " + second + ", " + third);

    }

    //linear search -> O(n)
    //Binary search -> O(log n)

    // O(2^n)


    /**
     * Constant O(1)
     * Logarithmic O(log n)
     * Linear O(n)
     * Quadratic O(n^2)
     * Exponential O(2^n)
     */

    //Space Complexity -  Only look at the additional space need to allocate
    public void greet(String[] names) {
        // O(1) space -> due to i variable

        // O(n) space -> due the
        String[] copy = new String[names.length];

        for(int i =0; i < names.length; i++) {
            System.out.println("Hi " + names[i]);
        }
    }
}
