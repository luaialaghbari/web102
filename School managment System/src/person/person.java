package person;

public abstract class person {
    private int id ;
    private String Fullname ;
    private String phone ;
    private int age ;
    private String Gender ;
    private String educational_degree ;

    person (int id ,String n , String phon , int age , String Gender , String educational_degree){
        this.id = id ;
        this.Fullname = n ;
        this.phone=phon ;
        this.age= age ;
        this.Gender = Gender ;
        this.educational_degree = educational_degree ;
        }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getGender() {
        return Gender;
    }

    public void setEducational_degree(String educational_degree) {
        this.educational_degree = educational_degree;
    }

    public String getEducational_degree() {
        return educational_degree;
    }
    public void print_details (){
        System.out.println("------------------------------ Print Detalis ------------------------------");
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", Fullname='" + Fullname + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", Gender='" + Gender + '\'' +
                ", educational_degree='" + educational_degree + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
         this.id = id ;
    }
}
