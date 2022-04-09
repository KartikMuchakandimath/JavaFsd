package oop.interfaces;

public class testinterface {
public static void main(String[] args) {
	ITelephone tele = new DeskPhone();
	ITelephone tele1 = new MobilePhone();
	tele.poweron();
	tele.answer();
	tele.isringing();
	tele.callphone(1234555);

	tele.dail(123456);
	tele1.poweron(); 
}
}
