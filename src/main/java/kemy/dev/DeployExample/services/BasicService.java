package kemy.dev.DeployExample.services;

import kemy.dev.DeployExample.entities.RandomNumbersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicService {
    @Autowired
    public RandomNumbersDTO randomNumbersDTO;

    public int generateIntRandomNumbers(){
     return (int) (100*Math.random());
    }
    public String sumRandomNumbers(){
    int number1=  randomNumbersDTO.setRandom1(generateIntRandomNumbers());
    int number2= randomNumbersDTO.setRandom2(generateIntRandomNumbers());
    int sumOfNumbers=Math.addExact(number1,number2);
        return "Sum of "+number1+" and "+number2+" is: "+sumOfNumbers;
    }
}
