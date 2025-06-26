public class Main {
    public static void main(String[] args) {
       try{
           Thread one=new firstList();
           Thread two=new secondList();
           one.start();
           two.start();
           one.join();;
           two.join();
           System.out.println("all List is printed!");
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}