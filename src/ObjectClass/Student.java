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
public class Student {
    private String IdStudent;
    private String FirstName;
    private String LastName;
    private String Email;
    private String PassWord;
    private String Address;
    private String IdCourse;

    public Student(String IdStudent, String FirstName, String LastName, String Email, String PassWord, String Address, String IdCourse) {
        this.IdStudent = IdStudent;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.PassWord = PassWord;
        this.Address = Address;
        this.IdCourse = IdCourse;
    }

    public String getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(String IdStudent) {
        this.IdStudent = IdStudent;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getIdCourse() {
        return IdCourse;
    }

    public void setIdCourse(String IdCourse) {
        this.IdCourse = IdCourse;
    }

    @Override
    public String toString() {
        return "Student{" + "IdStudent=" + IdStudent + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email + ", PassWord=" + PassWord + ", Address=" + Address + ", IdCourse=" + IdCourse + '}';
    }
    
    
    
}
