

package MainPackage;


public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //массив преподавателей и студентов вуза
        Person univArr[] = new Person[6];
        univArr[0] = new Teacher("Ronald Turner", Teacher.Gend.MALE, "Computer science", Teacher.Degr.PHD, "Programming paradigms");
        univArr[1] = new Teacher("Ruth Hollings", Teacher.Gend.FEMALE, "Jurisprudence", Teacher.Degr.MSC, "Domestic arbitration");
        univArr[2] = new Student("Leo Wilkinson", Student.Gend.MALE, "Computer science", Student.Stage.BACHELOR, 3);
        univArr[3] = new Student("Anna Cunningham", Student.Gend.FEMALE, "World economics", Student.Stage.BACHELOR, 1);
        univArr[4] = new Student("Jill Lundqvist", Student.Gend.FEMALE, "Jurisprudence", Student.Stage.MASTER, 1);
        univArr[5] = new Student("Ronald Correa", Student.Gend.MALE, "Computer science", "Design of a functional programming language");
        
        //вывод на печать
        Person.printAll(univArr);

    }
    
}
