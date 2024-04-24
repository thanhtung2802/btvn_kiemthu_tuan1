package btvn_tuan1;

public class SoNguyenTo {
	public static void main(String[] args) {
        int start = 2;
        int end = 100;
        
        System.out.println("Các số nguyên tố từ " + start + " đến " + end + " là:");
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
