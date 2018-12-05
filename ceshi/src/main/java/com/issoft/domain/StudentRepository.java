package com.issoft.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student,Integer>, JpaSpecificationExecutor<Student> {
	Student findBySname(String Sname);
        static void deleteByCnameAndSname(String cname,String sname) {
		// TODO Auto-generated method stub
		
	}
    @Modifying
    @Query("update Student set cname=:cname where id=:id")
    int updatecnameByid(@Param("id") Integer id,@Param("cname") String cname);
//    
//    @Modifying
//    @Query("delete from Student where cname=:cname ")
//    void deleteByCnameAndSname(@Param("cname") String cname);


    List<Student> findByCnameAndSnameNotNullOrderByIdDesc(String cname);



}
