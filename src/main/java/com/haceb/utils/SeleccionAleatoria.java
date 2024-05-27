package com.haceb.utils;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SeleccionAleatoria {
    public static WebElement selectRandomElement(List<WebElement> items) {

        Random random = new Random();
        int randomIndex = random.nextInt(items.size());


        return items.get(randomIndex);



    }

}

