public class TypeConverting {
    public static void main(String[] args) {
        int number = 555;
        byte shorter = (byte)number;
        byte second = (byte) (number & 0xFF);
        System.out.println(shorter);
    }
}
