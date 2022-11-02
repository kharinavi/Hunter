package ru.kharina.study.hunter;

import java.util.ArrayList;
import java.util.List;

public class Hunter {
    private Animal currentAnimal;
    private List<Animal> animalList = new ArrayList<>();

    /*public Hunter(Animal currentAnimal) {
        this.currentAnimal = currentAnimal;
    }*/

    private Hunter() {
    }

    public static Hunter getHunter(){
        return new Hunter();
    }

    public void setCurrentAnimal(Animal animal){
        this.currentAnimal = animal;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public void killAnimal(){
        System.out.println("Стреляю в " + currentAnimal.getClass().getSimpleName() + "\n" +
                "Попал!\n" + currentAnimal.sayBeforeDeath());
    }

    public void killAnimals(){
        for (Animal animal : animalList)
        System.out.println("Стреляю в " + animal.getClass().getSimpleName() + "\n" +
                "Попал!\n" + animal.sayBeforeDeath());
    }
}
