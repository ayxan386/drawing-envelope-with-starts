public class RectangleTwoLoops {
    public static void main(String[] args) {
        int n = 8, m = 20;
        double k = (double)m / n;
        for(int i=0;i < n; i++)
        {
            for(int j=0;j < m; j++)
            {
                //left to right diagonal
                if(j == (int)(i * k))
                {
                    System.out.print("*");
                }else if(j +  (int)(i * k) == m -1) // right to left diagonal
                {
                    System.out.print("*");
                }
                else if(i == 0 || i == n-1) // horizontal lines
                {
                    System.out.print("*");
                }
                else if(j == 0 || j == m-1) // vertical lines
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" "); // Empty spaces
                }
            }
            System.out.println(); // new line
        }
    }
}
