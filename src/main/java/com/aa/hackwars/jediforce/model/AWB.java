package com.aa.hackwars.jediforce.model;

public class AWB {
	
	private int awbNo;
	private int flightNo;
	private java.time.LocalDate fligthDate;
	private java.time.LocalTime flightETD;
	private String origin;
	private String destination;
	private String agentName;
	private String product;
	private int pieces;
	private int firmedPcs;
	private int weight;
	private double firmedWgt;
	private double tenderedWgt;
	private int firmingRnk;
	private String firmingEmail;
	private java.time.LocalDate firmingTime;
	private String firmingStatus;
	private String notificationStatus;
	private String acceptanceStatus;
	private String remarks;
	
	public int getAwbNo() {
		return awbNo;
	}
	public void setAwbNo(int awbNo) {
		this.awbNo = awbNo;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public java.time.LocalDate getFligthDate() {
		return fligthDate;
	}
	public void setFligthDate(java.time.LocalDate purchaseDate) {
		this.fligthDate = purchaseDate;
	}
	public java.time.LocalTime getFlightETD() {
		return flightETD;
	}
	public void setFlightETD(java.time.LocalTime flightETD) {
		this.flightETD = flightETD;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPieces() {
		return pieces;
	}
	public void setPieces(int pieces) {
		this.pieces = pieces;
	}
	public int getFirmedPcs() {
		return firmedPcs;
	}
	public void setFirmedPcs(int firmedPcs) {
		this.firmedPcs = firmedPcs;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getFirmedWgt() {
		return firmedWgt;
	}
	public void setFirmedWgt(double firmedWgt) {
		this.firmedWgt = firmedWgt;
	}
	public double getTenderedWgt() {
		return tenderedWgt;
	}
	public void setTenderedWgt(double tenderedWgt) {
		this.tenderedWgt = tenderedWgt;
	}
	public int getFirmingRnk() {
		return firmingRnk;
	}
	public void setFirmingRnk(int firmingRnk) {
		this.firmingRnk = firmingRnk;
	}
	public String getFirmingEmail() {
		return firmingEmail;
	}
	public void setFirmingEmail(String firmingEmail) {
		this.firmingEmail = firmingEmail;
	}
	public java.time.LocalDate getFirmingTime() {
		return firmingTime;
	}
	public void setFirmingTime(java.time.LocalDate firmingTime) {
		this.firmingTime = firmingTime;
	}
	public String getFirmingStatus() {
		return firmingStatus;
	}
	public void setFirmingStatus(String firmingStatus) {
		this.firmingStatus = firmingStatus;
	}
	public String getNotificationStatus() {
		return notificationStatus;
	}
	public void setNotificationStatus(String notificationStatus) {
		this.notificationStatus = notificationStatus;
	}
	public String getAcceptanceStatus() {
		return acceptanceStatus;
	}
	public void setAcceptanceStatus(String acceptanceStatus) {
		this.acceptanceStatus = acceptanceStatus;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

}
