/**
 * 
 */
package main.java.dao;



import java.util.List;


import main.java.demo.Student;
import main.java.demo.StudentRawMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author hemal.prajapati
 *
 */
@Component
public class SpringDemoDS implements ISpringDemo {
	

	private JdbcTemplate jdbcTemplate;
	
	@Autowired(required = true)
	public  SpringDemoDS(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate=jdbcTemplate;
	}




	@Override
	public void updateUserInfo() {
		 String SQL = "update user set salary = ? where id = ?";
		 jdbcTemplate.update(SQL, 1000, 1);
	      return;
	}




	@Override
	public void getUserInfo() {
		String sql="select * from user where id=?";
		Student s= (Student) jdbcTemplate.queryForObject(sql,new Object[]{1}, new  StudentRawMapper());
		System.out.println(s);
	}




	@Override
	public void getUserList() {
		String sql="select * from user";
		List<Student> studentList=jdbcTemplate.query(sql,new StudentRawMapper());
		System.out.println("Hello");
	} 
	
	

}
