package com.nam.mvc_pattern;

public class MVCPatternDemo {
    public static void main(String[] args){

        //fetch student record based on his roll no from the database
        Student model = RetrieveStudentFromDatabase();

        //Create a view : to write student detail on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student RetrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
