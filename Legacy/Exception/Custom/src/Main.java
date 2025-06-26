public class Main {
    public static void main(String[] args) {
        try{
            int balance=20;
            throw new LowBalance();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}