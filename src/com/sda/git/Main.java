package com.sda.git;

public class Main {

    public static void main(String[] args) {


            CustomList<String> lista = new CustomList<>();

            lista.add("Jan");
            lista.add("Maciej");
            lista.add("Maciej2");
            lista.add("Maciej3");
            lista.add("Maciej4");
            lista.add("Maciej5");
            lista.add("Maciej6");
            lista.add("Maciej7");
            lista.add("Maciej8");
            lista.add("Maciej9");
            lista.add("Maciej10");
            lista.add("Maciej11");
            lista.add("Maciej12");
            lista.add("Maciej13");
            lista.add("Maciej14");
            lista.add("Maciej15");
            lista.add("Maciej16");


            for(int i=0; i < lista.size(); i++)
            {
                System.out.println(lista.get(i));
            }




    }
}
