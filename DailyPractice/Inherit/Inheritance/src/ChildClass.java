public class ChildClass extends BaseClass{
    public void test(){
        System.out.println("Test call to check if parent can call it");
    }
    @Override
    public void callMe() {
        super.callMe();
        System.out.println("Call is done from Child Class");
    }

    public static void main(String[] args) {
        BaseClass base=new ChildClass();
        base.callMe();
        base.parentTest();
    }
}
