class Animal{
     public void eat(){
        System.out.println("The dog is eating something:-");
    }
}
class Dog extends Animal{
       public void bark(){
            System.out.println("The Dog are Bark:-");
        }

    }





public class inheritance1 {
    public static void main (String[]args){
        Dog d  = new Dog();
        d.eat();
        d.bark();

    }
    
}
