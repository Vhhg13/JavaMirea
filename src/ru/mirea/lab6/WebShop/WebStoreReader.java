package ru.mirea.lab6.WebShop;

import java.util.Locale;
import java.util.Scanner;

public interface WebStoreReader {
    Scanner scanner=new Scanner(System.in);
    static void enterNewComputer(WebStore ws){
        for(int i=0;i<3;++i){
            System.out.println("Введите имя");
            String name = scanner.nextLine().toUpperCase(Locale.ROOT);
            ComputerName cName=ComputerName.NONAME;
            try{
                cName=ComputerName.valueOf(name);
            }catch(Exception e){
                --i;
                System.out.println("Компьютеров с таим именем не бывает");
                continue;
            }
            System.out.println("Введите процессор");
            String proc = scanner.nextLine();
            System.out.println("Введите монитор");
            String mon = scanner.nextLine();
            System.out.println("Введите название памяти");
            String mem = scanner.nextLine();
            System.out.println("Введите цену");
            double price = scanner.nextDouble();

            ws.addGoodToStore(new Computer(cName, new Processor(proc), new Memory(mem), new Monitor(mon), price));
        }
    }
}
