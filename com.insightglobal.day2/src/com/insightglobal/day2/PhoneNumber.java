package com.insightglobal.day2;

public class PhoneNumber {
	
	private String areaCode;
	private String exchange;
	private String extension;
	
	public PhoneNumber(String areaCode,String exchange,String extension) {
		if(areaCode.length()!=3 || exchange.length()!=3 || extension.length()!=4) {
			throw new IllegalArgumentException("Invalid phone number components");
		}
		
		if(!areaCode.matches("\\d{3}") || !exchange.matches("\\d{3}") || !extension.matches("\\d{4}")) {
			throw new IllegalArgumentException("Phone number components must be digits only");
		}
		
		this.areaCode=areaCode;
		this.exchange=exchange;
		this.extension=extension;
	}
	
	@Override
	public String toString() {
		return String.format("(%s) %s-%s", areaCode,exchange,extension);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		
		if(obj==null || getClass()!=obj.getClass()) {
			return false;
		}
		
		PhoneNumber that = (PhoneNumber) obj;
		
		return this.areaCode.equals(that.areaCode) && this.exchange.equals(that.exchange) && this.extension.equals(that.extension);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhoneNumber p1=new PhoneNumber("800","867","5309");
		PhoneNumber p2=new PhoneNumber("800","789","5678");
		PhoneNumber p3=new PhoneNumber("800","555","1234");
		
		System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3)); 

	}

}
