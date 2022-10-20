package ru.kharina.study.hunter;

public class Hunter {
    private Animal currentAnimal;

    public Hunter(Animal currentAnimal) {
        this.currentAnimal = currentAnimal;
    }

    public void setCurrentAnimal(Animal animal){
        this.currentAnimal = animal;
    }

    public void killAnimal(){
        System.out.println("Стреляю в " + currentAnimal.getClass().getSimpleName() + "\n" +
                "Попал!\n" + currentAnimal.sayBeforeDeath());
    }
}
