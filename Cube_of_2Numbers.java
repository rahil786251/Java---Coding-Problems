//This program is designed to compute the cube of the sum of two numbers.



public class q35_Problem {
    static int findValue(int a, int b) {
        int ans = (a + b) * (a + b) * (a + b); 
        return ans;
    }

    public static void main(String[] args) {
        int ans = findValue(3, 3);
        System.out.println(ans);
    }
}
