package person ;

import java.util.ArrayList;

public class Teacher extends person {

    private ArrayList<String> Teach;

    public Teacher(int id, String n, String phon, int age, String Gender, String educational_degree, ArrayList<String> moad) {
        super(id, n, phon, age, Gender, educational_degree);
        this.Teach= moad;
    }
    public int getmoad() {
        return Teach.size() ;
    }
    public String getMoad(int x) {
        return Teach.get(x);
    }

    public void setMoad(int x, String y) {
        Teach.set(x, y);
    }

    public void add(String y) {
        Teach.add(y);
    }


    @Override
    public void print_details() {
        super.print_details();
        System.out.println("ID Teacher Name teacher phone teacher age Teacher Gender teacher educational_degree teacher Teach teacher ");
        System.out.print(getId()+ "   " );
        System.out.print( getFullname()  +"   " );
        System.out.print(getPhone() +"   " );
        System.out.print(getAge() +"   " );
        System.out.print(getGender() +"   " );
        System.out.print(getEducational_degree() +"   " );
        for(int i = 0 ; i < (Teach.size() ) ; i++ )
            System.out.print(Teach.get(i) +"," );
    }

    public void printDetalis (){

    }


}
