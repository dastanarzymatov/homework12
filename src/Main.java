public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.setName("Tom");
      cat.setJashy(2);
      cat.setEmneKylaalat("chychkan karmai alat");
        System.out.println("myshyktyn aty: "+cat.getName()+ ",  jashy: "+cat.getJashy()+" de "+", al "+cat.getEmneKylaalat());


        Fish fish=new Fish();
        fish.setName("forelbek");
        fish.setAge(2);
        fish.setColor("grey");
        fish.setCanDo("suzo alat ");
        System.out.println("name fish: "+fish.getName()+",  age : "+fish.getAge()+", color: "+fish.getColor()+", can: "+fish.getCanDo());

        Parrot parrot=new Parrot();
        parrot.setName("Rio");
        parrot.setAge(3);
        parrot.setColor("blue");
        parrot.setWhatCanHeDo("he can speak");
        System.out.println("name parrot: "+parrot.getName()+", age parrot: "+parrot.getAge()+", color parrot: "+parrot.getColor()+", WhatCanHeDo: "+parrot.getWhatCanHeDo());


        Dog dog=new Dog();
        dog.setName("Alabai");
        dog.setAge(3);
        dog.setColor("Black");
        dog.setWhatCanHeDo("guards houses");

        System.out.println("name dog: "+dog.getName()+" :age dog: "+dog.getAge()+" :doc color: "+dog.getColor()+" :WhatCanHeDo: "+dog.getWhatCanHeDo());
    }
}