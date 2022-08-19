package kemy.dev.DeployExample.entities;

import org.springframework.stereotype.Component;

@Component
public class RandomNumbersDTO {
    private int random1;
    private int random2;

    public RandomNumbersDTO() {
    }
    public RandomNumbersDTO(int random1, int random2) {
        this.random1 = random1;
        this.random2 = random2;


    }

    public int getRandom1() {
        return random1;
    }

    public int setRandom1(int random1) {
        this.random1 = random1;
        return random1;}

    public int getRandom2() {
        return random2;
    }

    public int setRandom2(int random2) {
        this.random2 = random2;
        return random2;
    }


}
