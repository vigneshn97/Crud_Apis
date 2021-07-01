package com.springrest.springrest.service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    //    List<Course> list =new ArrayList<>();
    public  CourseServiceImpl(){
        //        list.add(new Course(145L,"java","this is java course"));
        //        list.add(new Course(4343L,"python","this is python course"));
    }

    @Override
    public List<Course> getCourse() {
        //        return list;
        return courseDao.findAll();
    }

    public Course getSingleCourse(long courseId) {

        Course course = null;

        return courseDao.getById(courseId);
    }


    public Course addCourse(Course course){
        courseDao.save(course);
        return course;
    }

    public void deleteCourse(long parseLong) {

        //        list = this.list.stream().filter(e->e.getId()== parseLong).collect(Collectors.toList());

        Course course = courseDao.getById(parseLong);

        courseDao.delete(course);
    }

    public Course updateCourse(Course course){
        //        list.forEach(e -> {
        //            if(e.getId() == course.getId()){
        //                e.setTitle(course.getTitle());
        //                e.setDescription(course.getDescription());
        //            }
        //        });
        courseDao.save(course);
        return course;
    }

}
