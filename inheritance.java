class base{
    public int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        System.out.println("I am in the x base:-");
        this.x=x;
    }
    public void printMe(){
        System.out.println("I am a constructor!");
    }

}
class Derived extends base{
    public int y;

    public int gety(){
        return y;
    }
    public void sety(int y){
        System.out.println("I am in the y Derived:- ");
        this.y=y;
    }
}

public class inheritance{
    public static void main(String[]args){
        //creating an object of base class
        base b=new base();
        b.setx(90);
        System.out.println(b.getx());

        //creating an object of derived class

        Derived d=new Derived();
        d.sety(67);
        System.out.println(d.gety());

    }
}