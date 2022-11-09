package person;


import java.util.ArrayList;
import java.util.Scanner;

public class Trying {

    public void Print_for_edit (){
        System.out.println("1.Input one to Edit name ");
        System.out.println("2.Input two to Edit phon ");
        System.out.println("3.Input three to Edit age ");
        System.out.println("4.Input four to Edit Gender ");
        System.out.println("5.Input five to Edit educational_degree ");
        System.out.println("6.Input five to Edit moad ");
    }

    public void printStudents(String name) {
        System.out.println("1.Input one to add  " + name);
        System.out.println("2.Input two to edit  " + name);
        System.out.println("3.Input three to print  " + name);
        System.out.println("Please input 1 or 2 or 3 or -1 for exit ");
        // ---------------------
    }
    public void printTry() {
        System.out.println("The input is inccorect ");
        System.out.println("please input 1 or 2  ");
    }

    public boolean IsNumber(String data){
        try {
            int check = Integer.parseInt(data);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}




