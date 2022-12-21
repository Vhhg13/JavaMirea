package ru.mirea.lab24;

public interface AbstractChairFactory {
    MagicChair createMagicChair();
    VictorianChair createVictorianChair();
    MultifunctionalChair createMultifunctionalChair();
}
