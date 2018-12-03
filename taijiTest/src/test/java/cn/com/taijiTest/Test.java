package cn.com.taijiTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;

public class Test {
	EntityManagerFactory factory;
	EntityManager entityManager;
	EntityTransaction transaction;

	@Before
	public void test() {

		// 1. 创建EntityManagerFactory
		factory = Persistence.createEntityManagerFactory("taiji");

		// 2. 创建EntityManager
		entityManager = factory.createEntityManager();

		// 3.开启事务
		transaction = entityManager.getTransaction();

	}

	// 增加
	@org.junit.Test
	public void name() {
		// 开启事务
		transaction.begin();
		// 4. 持久化操作
		Student student = new Student();
		student.setSname("丽丽");
		student.setCname("语文");
		System.out.println(student);
		Student student1 = new Student();
		student1.setSname("方方方");
		student1.setCname("数学");
		System.out.println(student1);
		Teacher teacher = new Teacher();
		teacher.setCname("语文");
		teacher.setTname("王老师");
		System.out.println(teacher);

		// 添加user到数据库，相当于hibernate的save();
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(teacher);
		// 提交事务
		transaction.commit();
	}

	// 查找
	@org.junit.Test
	public void Test2() {
		// TODO Auto-generated constructor stub
		// 开启事务
		transaction.begin();
		Student student = entityManager
				.createQuery("SELECT o FROM student o WHERE o.id = ?1 AND o.sname=?2", Student.class).setParameter(1, 1)
				.setParameter(2, "丽丽").getSingleResult();
		System.out.println(student);
		// 提交事务
		transaction.commit();
	}

	// 删除
	@org.junit.Test
	public void Test3() {
		// TODO Auto-generated constructor stub
		// 开启事务
		transaction.begin();
		Student student = entityManager
				.createQuery("SELECT o FROM student o WHERE o.id = ?1 AND o.sname=?2", Student.class).setParameter(1, 1)
				.setParameter(2, "丽丽").getSingleResult();
		System.out.println(student);
		//entityManager.remove(student);
		// 提交事务
		transaction.commit();
	}

	@After
	public void test1() {

		// 5. 提交事务
		transaction.commit();

		// 6. 关闭EntityManager
		entityManager.close();

		// 7. 关闭EntityManagerFactory
		factory.close();
	}

}
