
package MainPackage;


public class Teacher extends Person {//класс преподавателей
    protected enum Degr {MSC, PHD, DRS}//константы ученой степени
    protected Degr degree;//ученая степень
    protected String special;//специальность

    //блок конструкторов
    public Teacher() {
    }

    public Teacher(String name, Gend gender, String department, Degr degree, String special) {
        super(name, gender, department);
        setDegree(degree);
        setSpecial(special);
    }
    
    //блок геттеров и сеттеров. По условию задачи проверки ввода реализовывать не нужно

    public Degr getDegree() {
        return degree;
    }

    public void setDegree(Degr degree) {
        this.degree = degree;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }
    
    //переопределенные методы
    @Override
    //вывод на печать информации о преподавателе
    public void print () {
    switch (gender) {//вывод на печать с местоимением по гендеру
        case MALE:
            System.out.print("This is " + name + ". He teaches at "
                    + department + ". ");
            System.out.println(" He has " + degree + " in "
                    + special + ".");
            break;
        case FEMALE:
            System.out.print("This is " + name + ". She teaches at "
                    + department + ". ");
            System.out.println(" She has " + degree + " in "
                    + special + ".");
            break;
            }

    }

   
}
