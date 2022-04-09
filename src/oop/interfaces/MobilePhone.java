package oop.interfaces;

public class MobilePhone implements ITelephone{

	@Override
	public void poweron() {
		// TODO Auto-generated method stub
		System.out.println("switch on");
		
	}

	@Override
	public void dail(int phonenum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean callphone(int phonenum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isringing() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
