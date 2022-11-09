package person;
import java.util.ArrayList;
import java.util.Scanner;

public class  Students extends person {
  Scanner Input = new Scanner(System.in);
  private ArrayList<String> moad = new ArrayList<String>();
  public Students(int id, String n, String phon, int age, String Gender, String educational_degree) {
    super(id, n, phon, age, Gender, educational_degree);
  }

  @Override
  public String toString() {
    return "Students{" +super.toString()+
            " Input=" + Input +
            ", moad=" + moad +
            '}';
  }

  public int getmoad() {
    return moad.size() ;
  }
  public String getMoad(int x) {
    return moad.get(x);
  }

  public void setMoad(int x, String y) {
    moad.set(x, y);
  }

  public void return_name () {
    int y = Input.nextInt() ;
  }

  public void add(String y) {
    moad.add(y);
  }
    @Override
    public void print_details () {
      super.print_details();
      System.out.println("ID"+ "   " + "Name Student "+ "   " + "phone Students "+ "   " + "age Students " + "   "+"Gender Students "+ "   " + "educational_degree Students "+ "   " +  "Teach Students"+ "   ");
      System.out.print(getId()+ "   " );
      System.out.print( getFullname()  +"\t" );
      System.out.print(getPhone() +"\t" );
      System.out.print(getAge() +"\t" );
      System.out.print(getGender() +"\t" );
      System.out.print(getEducational_degree() +"\t" );
      for(int i = 0 ; i < (moad.size()) ; i++ )
      System.out.print(moad.get(i) +"," );
      System.out.println("" );
      System.out.println("------------------------------ Finish Print Detalis ------------------------------");
    }
}
