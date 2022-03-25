package com.learningJava;

public class PC {
    private Case pcCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case pcCase, Monitor monitor, Motherboard motherboard) {
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerOn(){
        pcCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        // Graphics
        monitor.drawPixelAt(1200,50,"yellow");
    }
}
