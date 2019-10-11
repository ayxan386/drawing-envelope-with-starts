public class Circle {
    public static void main(String[] args) {
        int r = 7;
        int width = 15,height = 15;
        int xc = width / 2, yc = height / 2;
        for(int y = 0; y < height; y++)
        {
            for(int x=0; x < width; x++)
            {
                if((xc - x) * (xc - x) + (yc - y) * (yc - y) <= r * r)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
