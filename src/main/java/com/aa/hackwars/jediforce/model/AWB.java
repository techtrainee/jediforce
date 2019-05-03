package com.aa.hackwars.jediforce.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AWB {

	private String awbNumber;
	private String flightNumber;
	private LocalDate fligthDate;
	private LocalTime flightETD;
	private String origin;
	private String destination;
	private String agentName;
	private String product;
	private int pieces;
	private int firmedPieces;
	private int tenderedPieces;
	private int weight;
	private double firmedWeight;
	private double tenderedWeight;
	private int firmingRank;
	private String firmingEmail;
	private LocalDateTime firmingTime;
	private String firmingStatus;
	private String notificationStatus;
	private String acceptanceStatus;
	private String remarks;

	public String getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public LocalDate getFligthDate() {
		return fligthDate;
	}

	public void setFligthDate(LocalDate fligthDate) {
		this.fligthDate = fligthDate;
	}

	public LocalTime getFlightETD() {
		return flightETD;
	}

	public void setFlightETD(LocalTime flightETD) {
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

	public int getFirmedPieces() {
		return firmedPieces;
	}

	public void setFirmedPieces(int firmedPieces) {
		this.firmedPieces = firmedPieces;
	}

	public int getTenderedPieces() {
		return tenderedPieces;
	}

	public void setTenderedPieces(int tenderedPieces) {
		this.tenderedPieces = tenderedPieces;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getFirmedWeight() {
		return firmedWeight;
	}

	public void setFirmedWeight(double firmedWeight) {
		this.firmedWeight = firmedWeight;
	}

	public double getTenderedWeight() {
		return tenderedWeight;
	}

	public void setTenderedWeight(double tenderedWeight) {
		this.tenderedWeight = tenderedWeight;
	}

	public int getFirmingRank() {
		return firmingRank;
	}

	public void setFirmingRank(int firmingRank) {
		this.firmingRank = firmingRank;
	}

	public String getFirmingEmail() {
		return firmingEmail;
	}

	public void setFirmingEmail(String firmingEmail) {
		this.firmingEmail = firmingEmail;
	}

	public LocalDateTime getFirmingTime() {
		return firmingTime;
	}

	public void setFirmingTime(LocalDateTime firmingTime) {
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
