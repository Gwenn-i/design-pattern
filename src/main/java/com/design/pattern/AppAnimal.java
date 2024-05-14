package com.design.pattern;

import com.design.pattern.without.bridge.RedFox;
import com.design.pattern.without.bridge.RedRabbit;
import com.design.pattern.without.bridge.Fox;
import com.design.pattern.without.bridge.Rabbit;
import com.design.pattern.without.bridge.RedDog;
import com.design.pattern.bridge.Red;
import com.design.pattern.bridge.White;
import com.design.pattern.without.bridge.Dog;
import com.design.pattern.bridge.Dog2;
import com.design.pattern.bridge.Green;
import com.design.pattern.bridge.Rabbit2;

public class AppAnimal 
{
    public static void main( String[] args )
    {
        //But: utiliser design pattern bridge (type structural) 

        //Sans Bridge
        Fox fox = new RedFox();
        Dog dog = new RedDog();
        Rabbit rabbit = new RedRabbit();

		fox.applyColor();
        dog.applyColor();
        rabbit.applyColor();

        //Avec Bridge
        Dog2 redDog = new Dog2(new Red());
        Rabbit2 redRabbit = new Rabbit2(new Red());
        Rabbit2 whiteRabbit = new Rabbit2(new White());
        Dog2 greenDog = new Dog2(new Green());

		redDog.applyColor();
        redRabbit.applyColor();
        whiteRabbit.applyColor();
        greenDog.applyColor();
    }
}
