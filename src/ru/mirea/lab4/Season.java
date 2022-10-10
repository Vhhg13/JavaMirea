package ru.mirea.lab4;

public enum Season {
    WINTER(-25),
    SPRING(10),
    SUMMER(23) {
        public void getDescription() {
            System.out.println("Тёплое время года");
        }
    },
    AUTUMN(9);

    public void getDescription() {
        System.out.println("Холодное время года");
    }

    private double temp;

    Season(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public static void iLove(Season season) {
        switch (season) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }

    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println("Весна́ — одно из четырёх времён года, переходный сезон между зимой и летом.\nСуществуют различные методы определения начала и окончания весны,\nотличающиеся в зависимости от местного климата, культур и обычаев.\nКогда в Северном полушарии весна, то в Южном полушарии осень и наоборот.\n");
        iLove(season);
        for (Season s : Season.values()) {
            System.out.print(s + " " + s.getTemp() + "°C ");
            s.getDescription();
        }
    }
}