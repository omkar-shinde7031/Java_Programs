import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Todoapp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<String>();
        boolean b = true;
        do
        {
            System.out.println("enter your choise \n add \n delete\n show");
            String ch = sc.next();

            switch(ch){
                case "add":
                    System.out.println("enter name");
                    String name = sc.next();
                    al.add(name);
                    System.out.println(name + " added");
                    break;
                case "delete":
                    System.out.println("enter no witch you want to delete");
                    int t = sc.nextInt();
                    if(t<al.size() && t>0){
                        name = al.remove(t-1);
                        System.out.println(name + " deleted sucessfully");
                    }else{
                        System.out.println("element not found");
                    }
                    break;
                case "show":
                    if(al.isEmpty()){
                        System.out.println("your list is empty:- ");
                    }else{
                    System.out.println("all names are:- ");
                    for(String i:al){ // for each loop
                        System.out.println(i);
                    }}
                    break;
                
            }
            System.out.println("enter true for continue");
            b = sc.nextBoolean();
        }while(b);
    }
}