package com.java.main;

import com.java.common.AppService;

public class AppController {
	private AppService service;
	public void chooseSystem(int selectNUmber) {
		switch(selectNUmber) {
		case 1:
			//service =  new UserService();
			break;
		case 2:
			
			break;
		case 3:
			//service =  new MovieService();
			break;
		case 4:
			System.out.println("# 프로그램을 종료합니다.");
			System.exit(0);
		case 5:
			System.out.println("# 프로그램을 종료합니다.");
			System.exit(0);
		default:
			System.out.println("# 메뉴를 다시 입력하세요.");
			
		}
		service.start();
	}

}
