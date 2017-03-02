package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public class PokemonData{
        public PokemonData(String name,String type,String moveName){
            this.name = name;
            this.type = type;
            this.move = moveName;
        }
        public String name;
        public String type;
        public String move;
    }

    public static void main(String[] args) {

        //TODO declare and initiate a Scanner
        Scanner sc = new Scanner(System.in);

        //TODO declare and initiate pokedex as an ArrayList to store pokemon data
        ArrayList<String> pokedex = new ArrayList();

        //TODO declare and initiate typeCountMap as a HashMap to count the number of each types of pokemon
        HashMap<String, Integer> typeCountMap = new HashMap();

        System.out.println("Enter the Number of pokemon in the pokedex:");
        //TODO 0: scan the number of the testData from user input
        int testData = sc.nextInt();

        //TODO use a loop to read several input data
        for(int i = testData; i>0; i--)
        {
            System.out.println("Enter pokemon name:");
            //TODO 1-1:scan pokemon name and save to a variable from user input
            String name = sc.next();
            pokedex.add(name);

            System.out.println("Enter pokemon type:");
            //TODO 1-2:scan pokemon type and save to a variable
            String type = sc.next();
            pokedex.add(type);

            System.out.println("Enter pokemon's move name:");
            //TODO 1-3:scan pokemon move's name
            String move = sc.next();
            pokedex.add(move);

            //TODO 2-1:create a new pokemon data from the above variables
            //TODO 2-2:add the pokemon data into pokedex
            //  System.out.println("Enter pokemon's habitat:");
            // String habitat = sc.next();
            // pokedex.add(habitat);

            //TODO 4: Tricky part!! get the value from the type counting map , add 1 and put it back (multiple line
            Integer count = typeCountMap.get(type);
            typeCountMap.put(type, 1);
        }

        //TODO 5 print out the created pokemon information (multiple lines
        for(int i =0;i<testData*3;i+=3)
        {
            System.out.println("name:" +pokedex.get(i)+ ", type:" +pokedex.get(i+1)+ ", move's name:" +pokedex.get(i+2));
        }

        //TODO 6 print out how many type of pokemons in the pokedex
        System.out.println("number of types of pokemon:" + typeCountMap.size());

    }
}

