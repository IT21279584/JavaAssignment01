package Exercise05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameOrder {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Store names into an arrayList
        ArrayList<String> names = new ArrayList<>();

        while(true){
            System.out.println("Enter a name : ");
            String name = sc.nextLine();

            if(name.isEmpty()){
                break;
            }
            names.add(name);
        }
        //Sorted the names alphabetical order
        Collections.sort(names);

        System.out.println("------Sorted Names List-----");
        for(String sortedNames : names){
            System.out.println(sortedNames);
        }

        sc.close();
    }
}
