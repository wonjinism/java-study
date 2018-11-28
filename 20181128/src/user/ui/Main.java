package user.ui;

import java.util.ArrayList;

import user.dao.UserDao;
import user.vo.User;

public class Main {
	public static void main(String[] args) {
		UserDao dao = new UserDao();
		ArrayList<User> list = dao.listUser();
		for (User user : list) {
			System.out.println(user.toString());
		}
	}
}
