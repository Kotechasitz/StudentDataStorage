/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passclass.Source;

/**
 *
 * @author 10.1803
 */
public class StuData {
    private String StuCode,Name,Grade,TypeClass;
    
     public String getStuCode() {
        return StuCode;
    }

    public void setStuCode(String stuCode) {
        StuCode = stuCode;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    
    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
    
    public String getTypeClass() {
        return TypeClass;
    }

    public void setTypeClass(String typeclass) {
        TypeClass = typeclass;
    }
}
