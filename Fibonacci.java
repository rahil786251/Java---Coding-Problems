//The program checks whether a given number n belongs to the Fibonacci sequence.

public class isFib {
    boolean isfib(int n) {
        int a = 0, b = 1, c = 0;
        
        if (n == 0 || n == 1)  
            return true; 
        
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
            if (c == n) 
                return true;
        }
        return false; 
    }
    
    public static void main(String[] args) {
        isFib obj = new isFib();
        boolean res = obj.isfib(9);
        System.out.println(res); 
    }
}
