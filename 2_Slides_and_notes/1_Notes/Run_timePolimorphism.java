/*
In this example, the Animal class has a method called makeSound, which is then overridden in the Dog and Cat classes to make a different sound. When we create instances of the Dog and Cat classes and call the makeSound method on them, the version of the method defined in the subclass is called instead of the one in the parent class. This is an example of runtime polymorphism, because the actual method that is called is determined at runtime based on the type of the object.

Method overriding is an important concept in object-oriented programming, because it allows subclasses to provide their own implementation of a method defined in a parent class, while still retaining the same method signature. This allows subclasses to specialize the behavior of a method for their specific needs, while still being able to use the method in the same way as the parent class.*/

class Animal {
  public void makeSound() {
    System.out.println("Some generic animal sound");
  }
}

class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Bark");
  }
}

class Cat extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Meow");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.makeSound();

    Animal animal1 = new Dog();
    animal1.makeSound();

    Animal animal2 = new Cat();
    animal1.makeSound();
  }
}


