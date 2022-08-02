class Animal{
    final void characteristics(){
        int legs = 4;
        int ears = 2;
        int eyes = 2;
        int tail = 1;

        System.out.println("General Characteristics of an Animal are:");
        System.out.println("Legs:"+legs);
        System.out.println("Ears:"+ears);
        System.out.println("Eyes:"+eyes);
        System.out.println("Tail:"+tail);
    }
}
public class Dog extends Animal{
    final void sound(){
        System.out.println();
        System.out.println("Additional Characteristcs:");
        System.out.println("Sound: Bhow Bhow");
    }
    public static void main(String[] args){
        Dog d = new Dog();
        d.characteristics();
        d.sound();
    }
    
}
