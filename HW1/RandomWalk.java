import java.util.Scanner;

public class RandomWalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close(); 
        int x = 0, y = 0;
        int steps = 0;    
        int dx = 1, dy = 0;         
        int segmentLength = 1;      
        int segmentPassed = 0;      
        int directionChanges = 0;   
        while (Math.abs(x) <= n && Math.abs(y) <= n) {    
              x += dx;
            y += dy;
            steps++;
            segmentPassed++;
            if (segmentPassed == segmentLength) {
                segmentPassed = 0;        
                int temp = dx;
                dx = -dy;
                dy = temp;
                directionChanges++;     
                if (directionChanges % 2 == 0) {
                    segmentLength++;
                }
            }
        }
        System.out.println("Total steps = " + steps);
    }
}