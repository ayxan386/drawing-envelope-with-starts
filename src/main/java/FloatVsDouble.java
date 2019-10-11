public class FloatVsDouble {
    public static void main(String[] args) {
        double k1 = 20.0 / 8;
        float k2 = 20.0f / 8;
        System.out.println(k1 + " " + k2);
        for(int i=0; i < 20;i++)
        {
            if(i * k1 != i * k2)
            {
                System.out.println((i * k1) + " " + (i * k2));
            }
        }
    }
}
