package user.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import user.vo.User;

public class UserDao {
	// DB 정보를 담은 마이바티스 객체
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	// 전체회원 목록 출력
	public ArrayList<User> listUser(){
		ArrayList<User> list = null;
		SqlSession session = null;
		
		try {
			session = factory.openSession(); // Exception
			UserMapper mapper = session.getMapper(UserMapper.class); // UserMapper interface 통째로 mapper에 연결
			list = mapper.listUser();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
}