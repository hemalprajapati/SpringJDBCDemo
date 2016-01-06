/**
 * 
 */
package main.java.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author hemal.prajapati
 *
 */
public class StudentRawMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNumber) throws SQLException {
		Student s=new Student();
		s.setFirst_Name(rs.getString("first_name"));
		s.setId(rs.getInt("id"));
		s.setLast_Name(rs.getString("last_name"));
		s.setSalary(rs.getLong("salary"));
		return s;
	}

	
}
