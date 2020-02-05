package io.courses.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    //Spring naming convention for custom method from CrudRepo is as follows
    //start with keyword find, then use By and followed by the property name with which filtering has to happen
    //Ex:- public List<Course> findByName(String name);
    //when more than one table is involved and if you want to filter based on the field on the second table
    //Ex:- find all the courses which are there in the particular topic as below

    List<Course> findByTopicId(String topicId);
}
