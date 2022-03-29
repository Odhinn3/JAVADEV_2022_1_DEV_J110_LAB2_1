/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author user
 */
public class Student extends Person {//класс студентов и аспирантов
    enum Stage {BACHELOR, MASTER}//константы ступени обучения
    Stage stage;//ступень обучения
    int n;//номер курса
    String thesis;//название диссертации

    //блок конструкторов
    //конструктор по умолчанию
    public Student() {
    }

 
    
    //конструктор аспиранта (четыре поля)
    public Student(String name, Gend gender, String department, String thesis) {
        super(name, gender, department);
        setThesis(thesis);
    }
    
    //конструктор студента (пять полей)
    public Student(String name, Gend gender, String department, Stage stage, int n) {
        super(name, gender, department);
        setStage(stage);
        setN(n);
    }
    

    
    //блок геттеров и сеттеров. По условию задачи проверки ввода реализовывать не нужно
    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }
    
    //переопределенные методы
    @Override
    //вывод на печать информации о студенте/аспиранте
    public void print () {
        if (thesis != null)//проверка принадлежности: аспирант   
        switch (gender) {
                case MALE://вывод на печать с местоимением по гендеру
                    System.out.print("This is " + name + ". He studies at "
                        + department + ". ");
                    System.out.println(" His thesis title is " + thesis);
                    break;
                case FEMALE:
                    System.out.print("This is " + name + ". She studies at "
                        + department + ". ");
                    System.out.println(" Her thesis title is " + thesis);
                    break;
        }
        else//студент бакалавриата/магистратуры
        switch (gender) {
                case MALE://вывод на печать с местоимением по гендеру
                    System.out.print("This is " + name + ". He studies at "
                        + department + ". ");
                    System.out.println(" He is " + n + "`th year "
                        + stage + " student.");
                    break;
                case FEMALE:
                    System.out.print("This is " + name + ". She studies at "
                        + department + ". ");
                    System.out.println(" She is " + n + "`th year "
                        + stage + " student.");
                    break;
            }
    }   
}
