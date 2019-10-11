public class RectangleWithOneLoop {
    public static void main(String[] args) {
        int width = 20, height = 8;
        double k = (double)width / height;
        for(int i=0; i < width * height; i++)
        {
            int x = i % width;
            int y = i / width;
            if(
                    y == 0
                    || y == height - 1
                    || x == 0
                    || x == width - 1
                    || x == (int)(y * k)
                    || (width - x - 1) == (int)(y * k)
            ){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            if(x == width -1)
            {
                System.out.println();
            }
        }
    }
}
