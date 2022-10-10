package ru.mirea.lab4.Computer;

public class Computer {
    private Monitor monitor;
    private Memory disk;
    private Processor processor;

    public Computer(Monitor monitor, Memory disk, Processor processor) {
        this.monitor = monitor;
        this.disk = disk;
        this.processor = processor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Memory getDisk() {
        return disk;
    }

    public void setDisk(Memory disk) {
        this.disk = disk;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }



}
