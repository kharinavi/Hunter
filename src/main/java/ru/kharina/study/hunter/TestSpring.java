package ru.kharina.study.hunter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        /*Goose gooseBean = context.getBean("GooseBean", Goose.class);
        Goat goatBean = context.getBean("GoatBean", Goat.class);
        Frog frogBean = context.getBean("FrogBean", Frog.class);

        Hunter hunter = new Hunter(goatBean);
        hunter.killAnimal();
        hunter.setCurrentAnimal(gooseBean);
        hunter.killAnimal();
        hunter.setCurrentAnimal(frogBean);
        hunter.killAnimal();*/

        Hunter hunterBean = context.getBean("hunter", Hunter.class);
        hunterBean.killAnimals();

        context.close();
    }
}
