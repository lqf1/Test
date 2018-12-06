package com.issoft;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.issoft.domain.Student;
import com.issoft.service.StudentService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CeshiApplicationTests{
    @Autowired
   StudentService studentService;
    @PersistenceContext
    EntityManager em;
    @Autowired
    private ObjectMapper objectMapper;
    @Test
    public void findOne() {
       Student student=studentService.findOne(3);
        System.out.println("111111111"+student);
    }
    @Test
    public void findAll(){
        List<Student>Students =studentService.findAll();
        System.out.println("22222222"+Students);
    }
    @Test
    public void findAllSort(){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        List<Student>Students =studentService.findAllSort(sort);
        System.out.println("33333333"+Students);
    }
    @Test
    public void findBySname(){
       Student student =studentService.findBySname("丽丽李");
        System.out.println("44444444"+student);
    }
    @Test
    public void updateStudents(){
       Student Student=studentService.findOne(4);
       Student.setCname("数学");
       Student result =studentService.updateStudent(Student);
        System.out.println("55555555"+result);
    }
    @Test
    public void updatecnameByid(){
        int count =studentService.updatecnameByid(3,"丽丽");
        System.out.println("66666666"+count);
    }
    @Test
    public void insertStudent(){
       Student Student= new Student();
       Student.setCname("语文1");
       Student.setSname("丽丽李");
       Student result =studentService.updateStudent(Student);
        System.out.println("77777777"+result);
    }
    //删除
    @Test
    public void deleteByCnameAndSname(){
       studentService.deleteByCnameAndSname("语文","丽丽李");

    }
    @Test
    public void deleteById(){
       studentService.deleteById(3);

    }
    //??
    @Test
    public void findByCnameAndSnameNotNullOrderByIdDesc(){
        List<Student>Students =studentService.findByCnameAndSnameNotNullOrderByIdDesc("语文");
        System.out.println("88888888"+Students);
    }
    //    ??
    @Test
    public void findOneC(){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Student> c = cb.createQuery(Student.class);
        Root<Student>Student = c.from(Student.class);
        c.select(Student).where(cb.equal(Student.get("语文1"),"丽丽李"));
       Student result =em.createQuery(c).getSingleResult();
        System.out.println("999999999"+result);
    }
    @Test
    public void page(){
        String map = "{\"page\" : 1,\"pageSize\" : 2," +
                " \"filter\":{ \"filters\":[{ \"field\" : \"sname\", \"value\":\"丽丽\"}]}}";
        Map searchParameters = new HashMap();
        try {
            searchParameters =objectMapper.readValue(map,new TypeReference<Map>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
       Map result =studentService.getPage(searchParameters);
        System.out.println("00000000"+result.get("total"));
        System.out.println("00000000"+result.get("students"));
    }

}
