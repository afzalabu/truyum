package com.cognizant.truyum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoSqlImpl implements MenuItemDao {

	public List<MenuItem> getMenuItemListAdmin() {

		return null;
	}

	public List<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void modifyMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub

	}

	public MenuItem getMenuItem(long menuItemId) {

		Connection conn = ConnectionHandler.getConnection();

		//PreparedStatement preparedStatement = conn.prepareStatement("select * from ");

		return null;
	}

}
