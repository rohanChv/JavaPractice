public class BasicLamda {
    public static void main(String[] args) {
        NumberGen generateNumber=()->123.45;
        NumberGen randomNumber=()->Math.random()*200;

        System.out.println("Number is :"+generateNumber.getNumber());
        System.out.println("Random Number is :"+randomNumber.getNumber());
        System.out.println(System.nanoTime());
        System.out.println(System.currentTimeMillis());
    }
}
