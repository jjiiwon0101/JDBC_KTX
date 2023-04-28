package com.java.Train;

import java.time.LocalDateTime;

public class Train {

	private int trainNo;                //열차번호  
	
    private String trainStart;          //열차가 출발하는 곳
    private LocalDateTime trainDepart;  //예매한 열차출발시간 
    
    private String trainTogo;           //열차가 도착하는 곳   
    private LocalDateTime trainArrive;  //예매한 열차도착예정시간     
    private int trainPrice;             //열차표 가격
    
    public Train() {}

	public Train(int trainNo, String trainStart, LocalDateTime trainDepart, String trainTogo, LocalDateTime trainArrive,
			int trainPrice) {
		super();
		this.trainNo = trainNo;
		this.trainStart = trainStart;
		this.trainDepart = trainDepart;
		this.trainTogo = trainTogo;
		this.trainArrive = trainArrive;
		this.trainPrice = trainPrice;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainStart() {
		return trainStart;
	}

	public void setTrainStart(String trainStart) {
		this.trainStart = trainStart;
	}

	public LocalDateTime getTrainDepart() {
		return trainDepart;
	}

	public void setTrainDepart(LocalDateTime trainDepart) {
		this.trainDepart = trainDepart;
	}

	public String getTrainTogo() {
		return trainTogo;
	}

	public void setTrainTogo(String trainTogo) {
		this.trainTogo = trainTogo;
	}

	public LocalDateTime getTrainArrive() {
		return trainArrive;
	}

	public void setTrainArrive(LocalDateTime trainArrive) {
		this.trainArrive = trainArrive;
	}

	public int getTrainPrice() {
		return trainPrice;
	}

	public void setTrainPrice(int trainPrice) {
		this.trainPrice = trainPrice;
	}

	@Override
	public String toString() {
		return "##열차정보 열차번호=" + trainNo + 
				", 출발지=" + trainStart + 
				", 출발시간=" + trainDepart +
				", 도착지=" + trainTogo + 
				", 예정도착시간=" + trainArrive + 
				", 가격=" + trainPrice;
	}

	

}
