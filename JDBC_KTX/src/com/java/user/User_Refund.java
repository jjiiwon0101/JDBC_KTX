package com.java.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.java.common.DataBaseConnection;



public class User_Refund {
	private DataBaseConnection connection =  
			DataBaseConnection.getInstance();
	     Scanner sc = new Scanner(System.in);
	
	     PreparedStatement pstmt = null;
	//회원 정보 검색
		public List<TrainUser> findByUser(String user_id) {
			List<TrainUser> userList = new ArrayList<>();
			String sql = "SELECT * FROM users WHERE user_id=?";
			
		
			System.out.println("회원번호를 입력하세요: ");
			try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql); ) {
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					TrainUser user = new TrainUser (
							rs.getInt("user_number"),
							rs.getString("user_id"),
							rs.getString("user_pw"),
							rs.getInt("user_budget"),
							rs.getInt("user_discount"),
							rs.getInt("user_rsv_train_tno"),
							rs.getString("user_rsv_train_rseat"),
							rs.getString("user_rsv_train_rev")
							);
					userList.add(user);
				}
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			return userList;
		}
		
		//회원정보 맞으면 환불 진행
		public void moneyReturn(int moneyR) {
			String sql = "DELETE FROM users WHERE user_budget";
			try {
				if(pstmt.executeUpdate() == 1) {
					System.out.println("\n### 검색한 회원의 환불을 진행합니다.");
					
				} else {
					System.out.println("\n### 검색한 회원의 번호로만 환불이 가능합니다.");
				}
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}
		
	}

