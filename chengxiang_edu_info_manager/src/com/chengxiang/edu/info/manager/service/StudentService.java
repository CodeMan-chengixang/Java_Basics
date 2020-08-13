package com.chengxiang.edu.info.manager.service;

import com.chengxiang.edu.info.manager.dao.StudentDao;
import com.chengxiang.edu.info.manager.domain.Student;

public class StudentService {
    private StudentDao studentDao = new StudentDao();
    public Boolean isExists(String sid) {
        Student[] students= studentDao.findAllStudent();
        Boolean exist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && sid.equals(students[i].getId())){
                exist = true;
                break;
            }
        }
        return exist;
    }

    public Boolean addStudent(Student stu) {
        return studentDao.addStudent(stu);
    }

    public Student[] findAllStudent() {
        Student[] students = studentDao.findAllStudent();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null){
                flag=true;
                break;
            }
        }
        if (flag){
            return students;
        }else {
            return null;
        }
    }

    public boolean delStudent(String sid) {
        return studentDao.delStudent(sid);
    }

    public boolean updateStudent(String sid, Student newStu) {
        return studentDao.updateStudent(sid,newStu);
    }
}
