import person.* ;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class school {
    public static void main(String[] args) throws IOException {
        new schoolmangment() ;
        Scanner Input = new Scanner(System.in);
        FileWriter F = new FileWriter("School mangment.txt");
        String Sys ="School Managment System";
        //---------------------------------------
        int k = 0;
        String name;
        String phon;
        int age;
        String Gender;
        String educational_degree;
        String madh;
        int Counter = 0;
        int CounterTeacher = 0;
        int x = 0;
        ArrayList<String> moad = new ArrayList<String>();
        List<String> dd = new ArrayList<>();
        ArrayList<Students> PeoplestudnetsList = new ArrayList<>();
        Teacher PeopleTeacher[] = new Teacher[10];
        Students Peoplestudnets[] = new Students[10];
        //---------------------------------------
        Trying q = new Trying();
        do {
            System.out.println("----------------------------- Hello Mohammed Almo3lme to My Program ----------------------------- ");
            System.out.println("1.Input one to  Students");
            System.out.println("2.Input two to  Teacher ");
            System.out.println ("3.Input three for print details school ");
            System.out.println("Please input 1 or 2 or 3 or -1 for exit ");
            //Check input
            try {
                x = Input.nextInt();
            } catch (Exception e) {
                q.printTry();
            }

            //if choose one
            if (x == 1) {
                q.printStudents("Students");
                try {
                    x = Input.nextInt();
                } catch (Exception e) {
                    q.printTry();
                }
                if (x == 1) {
                    System.out.println("Input how much Do you want add Students :");
                    try {
                        x = Input.nextInt();
                    } catch (Exception e) {
                        q.printTry();
                    }
                    for (int i = 0; i < x; i++) {
                        Counter = Counter + 1;
                        System.out.println("input FullName student");
                        name = Input.nextLine();
                        name += Input.nextLine();
                        System.out.println("input Phone student");
                        phon = Input.nextLine();
                        System.out.println("input age student");
                        age = Input.nextInt();
                        System.out.println("input Gender student");
                        Gender = Input.nextLine();
                        Gender += Input.nextLine();
                        System.out.println("input educational_degree student");
                        educational_degree = Input.nextLine();
                        System.out.println("Input how much Do you want add moad :");
                        k = Input.nextInt();
                        for (int s = 0; s < k; s++) {
                            System.out.println("input " + (s + 1) + "Madh");
                            madh = Input.next();
                            moad.add(madh);
                        }
                        Peoplestudnets[i] = new Students(i + 1, name, phon, age, Gender, educational_degree);
                        PeoplestudnetsList.add(new Students(i + 1, name, phon, age, Gender, educational_degree));

                        F.write(Peoplestudnets[i].toString());
                        F.close();
                    }
                } else if (x == 2) {
                    if (Counter != 0) {
                        for (int i = 0; i < Counter; i++)
                            Peoplestudnets[i].print_details();
                        System.out.println("Please enter id student for edit");
                        k = Input.nextInt();
                        if (k <= Counter && k != 0) {

                            q.Print_for_edit();
                            x = Input.nextInt();
                            if (x == 1) {
                                System.out.println(Peoplestudnets[k - 1].getId() + "  " + Peoplestudnets[k - 1].getFullname());
                                System.out.println("Please enter new name");
                                name = Input.nextLine();
                                name += Input.nextLine();
                                Peoplestudnets[k - 1].setFullname(name);
                            } else if (x == 2) {
                                System.out.println(Peoplestudnets[k - 1].getId() + "  " + Peoplestudnets[k - 1].getFullname());
                                Peoplestudnets[k - 1].getPhone();
                                System.out.println("Please enter new age");
                                phon = Input.nextLine();
                                phon += Input.nextLine();
                                Peoplestudnets[k - 1].setPhone(phon);
                            } else if (x == 3) {
                                System.out.println(Peoplestudnets[k - 1].getId() + "  " + Peoplestudnets[k - 1].getFullname());
                                Peoplestudnets[k - 1].getAge();
                                System.out.println("Please enter new name");
                                age = Input.nextInt();
                                Peoplestudnets[k - 1].setAge(age);
                            } else if (x == 4) {
                                System.out.println(Peoplestudnets[k - 1].getId() + "  " + Peoplestudnets[k - 1].getFullname());
                                System.out.println(Peoplestudnets[k - 1].getGender());
                                System.out.println("Please enter new name");
                                Gender = Input.nextLine();
                                Gender += Input.nextLine();
                                Peoplestudnets[k - 1].setFullname(Gender);
                            } else if (x == 5) {
                                System.out.println(Peoplestudnets[k - 1].getId() + "  " + Peoplestudnets[k - 1].getFullname());
                                System.out.println(Peoplestudnets[k - 1].getEducational_degree());
                                System.out.println("Please enter new name");
                                educational_degree = Input.nextLine();
                                Peoplestudnets[k - 1].setFullname(educational_degree);
                            } else if (x == 6) {
                                System.out.println(Peoplestudnets[k - 1].getId() + "  " + Peoplestudnets[k - 1].getFullname());
                                for (int i = 0; i < Peoplestudnets[k - 1].getmoad(); i++) {
                                    System.out.print((i + 1) + ".");
                                    System.out.println(Peoplestudnets[k - 1].getMoad(i) + " , ");
                                }
                                System.out.println("Please enter number moad");
                                x = Input.nextInt();
                                madh = Input.next();
                                Peoplestudnets[k - 1].setMoad(x, madh);
                            }

                        }
                    } else if (Counter == 0) {
                        System.out.println("please input some students to print details ");
                    }
                } else if (x == 3) {

                    if (Counter != 0) {
                        for (int i = 0; i < Counter; i++)
                            Peoplestudnets[i].print_details();
                    } else if (Counter == 0) {
                        System.out.println("please input some students to print details ");
                    }


                }


            }
            // if Choose two
          else if (x == 2) {
                q.printStudents("Teachers");
                try {
                    x = Input.nextInt();
                } catch (Exception e) {
                    q.printTry();
                }
                if (x == 1) {
                    System.out.println("Input how much Do you want add Teacher :");
                    try {
                        x = Input.nextInt();
                    } catch (Exception e) {
                        q.printTry();
                    }
                    for (int i = 0; i < x; i++) {
                        CounterTeacher = CounterTeacher + 1;
                        System.out.println("input FullName Teacher");
                        name = Input.nextLine();
                        name += Input.nextLine();
                        System.out.println("input Phone Teacher");
                        phon = Input.nextLine();
                        System.out.println("input age Teacher");
                        age = Input.nextInt();
                        System.out.println("input Gender Teacher");
                        Gender = Input.nextLine();
                        Gender += Input.nextLine();
                        System.out.println("input educational_degree Teacher");
                        educational_degree = Input.nextLine();
                        System.out.println("Input how much Do you want add moad :");
                        k = Input.nextInt();
                        for (int s = 0; s < k; s++) {
                            System.out.println("input " + (s + 1) + "Madh");
                            madh = Input.next();
                            moad.add(madh);
                        }
                        PeopleTeacher[i] = new Teacher(i + 1, name, phon, age, Gender, educational_degree, moad);
                    }
                } else if (x == 2) {
                    if (CounterTeacher != 0) {
                        for (int i = 0; i < CounterTeacher; i++)
                            PeopleTeacher[i].print_details();
                        System.out.println("Please enter id Teacher for edit");
                        k = Input.nextInt();
                        if (k <= CounterTeacher && k != 0) {

                            q.Print_for_edit();
                            x = Input.nextInt();
                            if (x == 1) {
                                System.out.println(PeopleTeacher[k - 1].getId() + "  " + PeopleTeacher[k - 1].getFullname());
                                System.out.println("Please enter new name");
                                name = Input.nextLine();
                                name += Input.nextLine();
                                PeopleTeacher[k - 1].setFullname(name);
                            } else if (x == 2) {
                                System.out.println(PeopleTeacher[k - 1].getId() + "  " + PeopleTeacher[k - 1].getFullname());
                                PeopleTeacher[k - 1].getPhone();
                                System.out.println("Please enter new age");
                                phon = Input.nextLine();
                                phon += Input.nextLine();
                                PeopleTeacher[k - 1].setPhone(phon);
                            } else if (x == 3) {
                                System.out.println(PeopleTeacher[k - 1].getId() + "  " + PeopleTeacher[k - 1].getFullname());
                                PeopleTeacher[k - 1].getAge();
                                System.out.println("Please enter new name");
                                age = Input.nextInt();
                                PeopleTeacher[k - 1].setAge(age);
                            } else if (x == 4) {
                                System.out.println(PeopleTeacher[k - 1].getId() + "  " + PeopleTeacher[k - 1].getFullname());
                                System.out.println(PeopleTeacher[k - 1].getGender());
                                System.out.println("Please enter new name");
                                Gender = Input.nextLine();
                                Gender += Input.nextLine();
                                PeopleTeacher[k - 1].setFullname(Gender);
                            } else if (x == 5) {
                                System.out.println(PeopleTeacher[k - 1].getId() + "  " + PeopleTeacher[k - 1].getFullname());
                                System.out.println(PeopleTeacher[k - 1].getEducational_degree());
                                System.out.println("Please enter new name");
                                educational_degree = Input.nextLine();
                                PeopleTeacher[k - 1].setFullname(educational_degree);
                            } else if (x == 6) {
                                System.out.println(PeopleTeacher[k - 1].getId() + "  " + PeopleTeacher[k - 1].getFullname());
                                for (int i = 0; i < PeopleTeacher[k - 1].getmoad(); i++) {
                                    System.out.print((i + 1) + ".");
                                    System.out.println(PeopleTeacher[k - 1].getMoad(i) + " , ");
                                }
                                System.out.println("Please enter number moad");
                                x = Input.nextInt();
                                madh = Input.next();
                                PeopleTeacher[k - 1].setMoad(x, madh);
                            }

                        }
                    } else if (CounterTeacher == 0) {
                        System.out.println("please input some Teacher to print details ");
                    }
                } else if (x == 3) {

                    if (CounterTeacher != 0) {
                        for (int i = 0; i < CounterTeacher; i++)
                            PeopleTeacher[i].print_details();
                    } else if (CounterTeacher == 0) {
                        System.out.println("please input some Teacher to print details ");
                    }


                }


            }

          else if (x==3)
            {
                if(Counter >= 0 && CounterTeacher >=0 )
                {
                    System.out.println("The students in school : " + Counter);
                    System.out.println("The Teacher in school : " + CounterTeacher);
                }

            }

            } while (x != -1) ;
        }

    }