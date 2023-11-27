package com.example.webdb1608persist.beans;

import com.example.webdb1608persist.dao.TeacherDao;
import com.example.webdb1608persist.entities.Teacher;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
@Getter
public class TeacherBean implements Serializable {

    @EJB
    private TeacherDao teacherDao;

    private Teacher selected;

    public List<Teacher> getTeachers(){
        return teacherDao.findAll();
    }

    public String showCourses(int id) {
        selected = teacherDao.find(id);
        return "courses_by_teacher";
    }
}
