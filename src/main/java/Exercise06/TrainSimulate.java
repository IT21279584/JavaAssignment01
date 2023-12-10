package Exercise06;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainSimulate {
    public static void main(String[] args){

        ArrayList<String> stations = new ArrayList<>();
        stations.add("Station A");
        stations.add("Station B");
        stations.add("Station C");
        stations.add("Station D");
        stations.add("Station E");

        System.out.println("------Available stations------");
        for (String station : stations) {
            System.out.println(station);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start station : ");
        String start = sc.nextLine();
        System.out.println("Enter end station : ");
        String end = sc.nextLine();

        int startIndex = stations.indexOf(start);
        int endIndex = stations.indexOf(end);

        if(startIndex != -1 && endIndex != -1 && startIndex <= endIndex){
            for(int i = startIndex; i <= endIndex; i++){
                System.out.println(stations.get(i));
            }
        }else{
            System.out.println("Invalid Station. Please enter the valid station");
        }
    }
}
