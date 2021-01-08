package com.ctmman.training;
class Animal {
}

class Mammal extends Animal {
}

class Reptile extends Animal {
}

public class LearningJava extends Mammal {

   public static void main(String args[]) {
      Animal a = new Animal();
      Mammal m = new Mammal();
      LearningJava d = new LearningJava();

      System.out.println(m instanceof LearningJava);
      System.out.println(d instanceof Animal);
      System.out.println(d instanceof LearningJava);
   }
}