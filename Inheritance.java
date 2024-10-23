public class Inheritance {
   class Animal {

      void eat() {
         System.out.println("eating...");
      }
   }
   class Dog extends Animal{
    
      void bark(){
         System.out.println("barking...");
      }
   }

   class weep extends Dog{
      
      void weep(){
         System.out.println("weeping...");
      }
   }

   public static void main(String[] args) {
      
      Dog obj = new Dog();
     
      obj.eat();

      obj.bark();

      obj.weep();
   }
   
}
