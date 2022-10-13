package ru.mirea.lab6.WebShop;

public class Computer {
    private ComputerName name;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private double price;

    public Computer(ComputerName name, Processor processor, Memory memory, Monitor monitor, double price) {
        this.name = name;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.price=price;
    }

    public Computer() {
        this(ComputerName.NONAME, new Processor(), new Memory(), new Monitor(), 100);
    }

    @Override
    public String toString() {
        return "Компьютер марки %s c процессором от %s, памятью от %s, монитором марки %s".formatted(name.toString(), processor.getName(), memory.getName(), monitor.getName());
    }

    public ComputerName getName() {
        return name;
    }

    public void setName(ComputerName name) {
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
