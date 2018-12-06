package com.lhk.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.lhk.dao.UserDao;
import com.lhk.domain.User;

public class UserDaoImpl implements UserDao {
	private DataSource database;
	
	public DataSource getDatabase() {
		return database;
	}

	public void setDatabase(DataSource database) {
		this.database = database;
	}

	@Override
	public void Save(User user) {
		try {
			Connection conn=database.getConnection();
			PreparedStatement pstm=conn.prepareStatement("insert into user(id,name,phone,age,address) values(?,?,?,?,?)");
			pstm.setObject(1, user.getId());
			pstm.setObject(2, user.getName());
			pstm.setObject(3, user.getPhone());
			pstm.setObject(4, user.getAge());
			pstm.setObject(5, user.getAddress());
			int rs=pstm.executeUpdate();
			System.out.println("成功保存"+rs+"条数据");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public User FindById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> FindAll() {
		List<User> list=new ArrayList<User>();
		try {
			Connection conn=database.getConnection();
			PreparedStatement pstm=conn.prepareStatement("select * from user");
			ResultSet rs=pstm.executeQuery();
			while(rs.next()){
				User user=new User();
				user.setId(Integer.parseInt(rs.getString("id")));
				user.setAge(Integer.parseInt(rs.getString("age")));
				user.setName(rs.getString("name"));
				user.setPhone(rs.getString("phone"));
				user.setAddress(rs.getString("address"));
				list.add(user);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
