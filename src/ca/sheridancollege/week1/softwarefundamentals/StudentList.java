/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author 14377
 */
public class StudentList {
    public static void main(String[] args) {
        //Create an array of students.
        Student [] sList = new Student[5];
        
        //Put names in the array.
        for(int i=0; i<sList.length; i++){
            
            sList[i] = new Student();
            sList[i].setName("Student"+(i+1));
        }
        
        //Print names of the students.
        for(Student s:sList){
            System.out.println("The name of the student is: "+s.getName());
    }
}
}