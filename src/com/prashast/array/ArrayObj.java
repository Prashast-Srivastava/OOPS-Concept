package com.prashast.array;

public class ArrayObj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prashast";
        s1.marks = 56;

        Student s2 = new Student();
        s2.name = "Simran";
        s2.marks = 96;

        Student s3 = new Student();
        s3.name = "Samriddhi";
        s3.marks = 86;
        
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student st : students){
            st.display();
        }
    }
}
