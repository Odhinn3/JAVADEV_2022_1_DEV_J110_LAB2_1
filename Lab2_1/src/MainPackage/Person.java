
package MainPackage;


public class Person {//класс персон
    protected String name;//имя и фамилия
    protected enum Gend {MALE, FEMALE}//пол
    protected Gend gender;
    protected String department;//факультет

    //блок конструкторов
    
    public Person() {
    }

    public Person(String name, Gend gender, String department) {
        setName(name);
        setGender(gender);
        setDepartment(department);
    }

    //блок геттеров и сеттеров
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gend getGender() {
        return gender;
    }

    public void setGender(Gend gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    //вывод на печать информации о персоне
    public void print () {
    }
    //вывод на печать информации обо всех персонах из массива
    public static void printAll (Person[] univArr) {
        for (Person t : univArr) {
            t.print();
        }
    
    }
   
   
}
