package com.pdf.com.pdf.secure;



public class PDStandardEncryption {

	private String OwnerPassword;
	
	private String UserPassword;

	public String getOwnerPassword() {
		return OwnerPassword;
	}

	public void setOwnerPassword(String ownerPassword) {
		OwnerPassword = ownerPassword;
	}

	public String getUserPassword() {
		return UserPassword;
	}

	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}

	public PDStandardEncryption(String ownerPassword, String userPassword) {
		super();
		OwnerPassword = ownerPassword;
		UserPassword = userPassword;
	}

	public PDStandardEncryption() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PDStandardEncryption [OwnerPassword=" + OwnerPassword + ", UserPassword=" + UserPassword + "]";
	}
	
	

	}
