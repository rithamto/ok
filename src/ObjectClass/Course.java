package ObjectClass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TuyenPVT
 */
public class Course {
    private String IdCourse;
    private String Name;
    private String Catelory;
    private Double Price;
    private String Instructor;
    private double Length;
    private int Lectures;
    private int StudentNum;
    private String Rate;

    public Course(String IdCourse, String Name, String Catelory, Double Price, String Instructor, double Length, int Lectures, int StudentNum, String Rate) {
        this.IdCourse = IdCourse;
        this.Name = Name;
        this.Catelory = Catelory;
        this.Price = Price;
        this.Instructor = Instructor;
        this.Length = (double)Math.floor(Length*100)/100;
        this.Lectures = Lectures;
        this.StudentNum = StudentNum;
        this.Rate = Rate;
    }

  


    public String getIdCourse() {
        return IdCourse;
    }

    public void setIdCourse(String IdCourse) {
        this.IdCourse = IdCourse;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCatelory() {
        return Catelory;
    }

    public void setCatelory(String Catelory) {
        this.Catelory = Catelory;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public String getInstructor() {
        return Instructor;
    }

    public void setInstructor(String Instructor) {
        this.Instructor = Instructor;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double Length) {
        this.Length = Length;
    }

    public int getLectures() {
        return Lectures;
    }

    public void setLectures(int Lectures) {
        this.Lectures = Lectures;
    }

    public int getStudentNum() {
        return StudentNum;
    }

    public void setStudentNum(int StudentNum) {
        this.StudentNum = StudentNum;
    }

    public String getRate() {
        return Rate;
    }

    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    @Override
    public String toString() {
        return "Course{" + "IdCourse=" + IdCourse + ", Name=" + Name + ", Catelory=" + Catelory + ", Price=" + Price + ", Instructor=" + Instructor + ", Length=" + Length + ", Lectures=" + Lectures + ", StudentNum=" + StudentNum + ", Rate=" + Rate + '}';
    }


    
    
}
