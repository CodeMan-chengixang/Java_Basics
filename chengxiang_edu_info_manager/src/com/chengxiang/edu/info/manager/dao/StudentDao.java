package com.chengxiang.edu.info.manager.dao;

import com.chengxiang.edu.info.manager.domain.Student;

public class StudentDao {
    private static Student[] students = new Student[5];

    public Student[] findAllStudent() {
        return students;
    }

    public Boolean addStudent(Student stu) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                index = i ;
                break;
            }
        }
        if (index==-1){
            return false;
        }else {
            students[index] = stu;
            return true;
        }
    }

    public boolean delStudent(String sid) {
        int index = getIndexById(sid);
        if (index == -1){
            return false;
        }else {
            students[index] = null;
            return true;
        }

    }

    public int getIndexById(String sid) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] !=null && sid.equals(students[i].getId())){
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean updateStudent(String sid, Student newStu) {
        int index = getIndexById(sid);
        if (index==-1){
            return false;
        }else {
            students[index] = newStu;
            return true;
        }

    }
}
