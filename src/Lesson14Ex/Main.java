package Lesson14Ex;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//Lesson14Ex1Of3 creat o metoda ce va returna lista lucrurilor
        List<String> toDoList = new ArrayList<>();
        toDoList.add("reply to emails");
        toDoList.add("cook");
        toDoList.add("shop for groceries");
        toDoList.add("laundry");

        for(String toDo : toDoList) {
            System.out.println(toDo);
        }
        System.out.println();
        //reply to emails
        //cook
        //shop for groceries
        //laundry



//Lesson14Ex2Of3 Lista String și va returna o colecție. afișați colecția cu valori unice la ecran.
        List<String> names = new ArrayList<>();
        names.add("Ioana");
        names.add("Sveta");
        names.add("Camelia");
        names.add("Maria");
        names.add("Sveta");
        names.add("Sveta");
        names.add("Maria");

        Set<String> uniqueNameSet = getUniqueNames(names);

        for (String name : uniqueNameSet) {
            System.out.println(name);
        }
        System.out.println();
        //Ioana
        //Sveta
        //Camelia
        //Maria


//Lesson14Ex3Of3 Dictionar Englez Roman
        Map<String, String> EngToRom = new HashMap<>();
        EngToRom.put("Computer", "Calculator");
        EngToRom.put("Corn", "Porumbr");
        EngToRom.put("Dance", "Dans");
        EngToRom.put("Drawing", "Desen");
        EngToRom.put("Eat", "Mananca");
        EngToRom.put("End", "Sfarsit");
        EngToRom.put("Flower", "Floare");
        EngToRom.put("Overloading", "Supraincarcare");
        EngToRom.put("Overriding", "Suprascrisa");
        EngToRom.put("Order", "Ordine");

        for (Map.Entry<String, String> entry : EngToRom.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //Drawing : Desen
        //Order : Ordine
        //Flower : Floare
        //Computer : Calculator
        //Corn : Porumbr
        //Dance : Dans
        //Overriding : Suprascrisa
        //Eat : Mananca
        //End : Sfarsit
        //Overloading : Supraincarcare
    }

    //implemented a method to generate unique names from the set
    public static Set<String> getUniqueNames(List<String> names) {
        Set<String> uniqueNames = new HashSet<>(names);
        return uniqueNames;
    } //takes List of String names as an arugment in method
      //sort of casting the List into HashSet (which removes duplicates)
}
