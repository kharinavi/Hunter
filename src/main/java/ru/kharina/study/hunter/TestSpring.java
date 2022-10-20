package ru.kharina.study.hunter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        /*Goose gooseBean = context.getBean("GooseBean", Goose.class);
        Goat goatBean = context.getBean("GoatBean", Goat.class);
        Frog frogBean = context.getBean("FrogBean", Frog.class);

        Hunter hunter = new Hunter(goatBean);
        hunter.killAnimal();
        hunter.setCurrentAnimal(gooseBean);
        hunter.killAnimal();
        hunter.setCurrentAnimal(frogBean);
        hunter.killAnimal();*/

        Hunter hunterBean = context.getBean("hunterBean", Hunter.class);
        hunterBean.killAnimals();

        context.close();
    }
}
