package ru.kharina.study.hunter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class SpringConfig {
    @Bean
    public Goat goat(){
        return new Goat();
    }
    @Bean
    public Goose goose(){
        return new Goose();
    }
    @Bean
    public Frog frog(){
        return new Frog();
    }
    @Bean
    public List<Animal> animalList(){
        return Arrays.asList(goat(),goose(),frog());
    }
    @Bean
    public Hunter hunter(){
        Hunter res = Hunter.getHunter();
        res.setAnimalList(animalList());
        return res;
    }
}
