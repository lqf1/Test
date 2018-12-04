package com.issoft.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student,Integer>, JpaSpecificationExecutor<Student> {
	Student findBysname(String sname);
    void deleteByCnameAndSname(String cname,String name);
    @Modifying
    @Query("update Student set cname=:cname where id=:id")
    int updatecnameByid(@Param("id") Integer id,@Param("cname") String cname);

    List<Student> findByCnameAndSnameNotNullOrderByIdDesc(String cname);



}
