public class PrimeNumberListGenerator {
    public static void main(String[] args) {
        int primeCount = 0; // Counter for the prime number
        int currentNumber = 2; // Start checking for prime numbers
        int[] primeNumbers = new int[50]; // Storing the first 50 prime numbers

        // Loop until 50 prime numbers are found
        while (primeCount < 50) {
            if (isPrime(currentNumber)) { // Check if the current number is prime
                primeNumbers[primeCount] = currentNumber; // Store the prime number in the array
                primeCount++; // Increment the count of prime numbers found
            }
            currentNumber++; // Move to the next number
        }

        // Displaying the 50 prime numbers
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int numberToCheck) {
        if (numberToCheck < 2) { // Numbers less than 2 are not prime
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numberToCheck); i++) { 
            if (numberToCheck % i == 0) { 
            }
        }
        return true; 
        
    }
}
