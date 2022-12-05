package ru.mirea.lab15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu15 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Example");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        JTextArea txt = new JTextArea();
        txt.setText("ABC");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] items = {"Australia", "China", "England", "Russia"};
        String[] descriptions = {
                "    Australia, officially the Commonwealth of Australia,\nis a sovereign country comprising the mainland of\nthe Australian continent, the island of Tasmania, and\nnumerous smaller islands. With an area of 7,617,930\nsquare kilometres (2,941,300 sq mi), Australia is the\nlargest country by area in Oceania and the world's\nsixth-largest country. Australia is the oldest,\nflattest, and driest inhabited continent, with the\nleast fertile soils. It is a megadiverse country.",
                "     China,[k] officially the People's Republic of China\n(PRC),[l] is a country in East Asia. It is the world's\nmost populous country with a population exceeding\n1.4 billion people.[m] China spans five geographical\ntime zones[n] and borders fourteen countries by\nland, the most of any country in the world, tied with\nRussia. China also has a narrow maritime boundary\nwith the disputed Taiwan.[p][q] Covering an area of\napproximately 9.6 million square kilometers\n(3,700,000 sq mi), it is the world's third largest\ncountry by total land area.",
                "     England is a country that is part of the United\nKingdom. It shares land borders with Wales to its west and\nScotland to its north. The Irish Sea lies northwest\nand the Celtic Sea to the southwest. It is separated\nfrom continental Europe by the North Sea to the east\nand the English Channel to the south. The country\ncovers five-eighths of the island of Great Britain,\nwhich lies in the North Atlantic, and includes over\n100 smaller islands, such as the Isles of Scilly\nand the Isle of Wight.",
                "     Russia (Russian: Россия, Rossiya, [rɐˈsʲijə]), or the\nRussian Federation,[c] is a transcontinental country\nspanning Eastern Europe and Northern Asia. It is the\nlargest country in the world, covering over\n17,098,246square kilometres (6,601,670 sq mi),\nand encompassing one-eighth of Earth's inhabitable\nlandmass. Russia extends across eleven time zones\nand shares land boundaries with fourteen countries,\nmore than any other country but China."
        };
        JComboBox menu = new JComboBox(items);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(descriptions[menu.getSelectedIndex()]);
            }
        });
        panel.add(menu);
        panel.add(txt);
        f.add(panel);
        f.pack();
        f.setSize(300,300);
        f.setVisible(true);
    }
}
