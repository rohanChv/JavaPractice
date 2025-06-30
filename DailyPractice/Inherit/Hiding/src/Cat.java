public class Cat extends Animal{
    public static void habitation(){
        System.out.println("I Live on streeets");
    }

    public static void main(String[] args) {
       Cat myCat=new Cat();
       Animal animal=myCat;
       Animal.habitation();

    }
}
