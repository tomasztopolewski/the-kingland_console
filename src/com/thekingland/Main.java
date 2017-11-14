package com.thekingland;

import com.thekingland.communication.Communique;
import com.thekingland.communication.Console;

import java.io.FileNotFoundException;

public abstract class Main {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        Communique communique = new Communique();
        communique.viewWelcome();

        communique.animationStartLoadingSettings();
        Console console = new Console();
        communique.animationEndLoadingSettings();

        while (true) {
            console.removeOrder();
            console.createOrder();
            console.doOrder();
        }

    }
}

// Tomasz Topolewski