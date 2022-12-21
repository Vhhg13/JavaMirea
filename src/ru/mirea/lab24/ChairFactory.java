package ru.mirea.lab24;

public class ChairFactory implements AbstractChairFactory{

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public VictorianChair createVictorianChair() {
        return null;
    }

    @Override
    public MultifunctionalChair createMultifunctionalChair() {
        return new MultifunctionalChair();
    }
}
