import java.awt.Point;
public class Assignment10 {

    // recursive method without any loop 
    public static Point recursive(int n) { 
        Point f = new Point();
        if (n < 0) {
            return f;
        } else if (n == 1) {
            f.x = 1;
            f.y = 1;
        } else {
            Point next = recursive(n - 1);
            f.x = next.y;
            f.y = next.x + next.y;
        }
        return f;
    }

 
    // iterative method without recursion 
    public static Point iterative(int n) { 
        Point f = new Point();
        if (n < 0) {
            return f;
        } else if (n == 1) {
            f.x = 1;
            f.y = 1;
        } else {
            int temp = 1;
            f.x = 1;
            f.y = 1;
            for (int i = 1; i < n; i++) {
                f.y = temp + f.x;
                f.x = temp;
                temp = f.y;
            }
        }
        return f;
    } 
 
    //Test code 
    public static void main(String[] args) { 
        for (int n = 10; n < 40; n += 5) { 
            Point f = recursive(n); 
            System.out.printf("recursive: f(%d)=%d/%d\n", n, f.x, f.y); 
            f = iterative(n); 
            System.out.printf("iterative: f(%d)=%d/%d\n", n, f.x, f.y); 
        } 
    } 
}
