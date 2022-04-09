package oop.interfaces;

public class DeskPhone implements ITelephone{

	@Override
	public void poweron() {
		// TODO Auto-generated method stub
		System.out.println("always on no action needed");
		
	}

	@Override
	public void dail(int phonenum) {
		// TODO Auto-generated method stub
		System.out.println("now ringing "+phonenum+" on deskphone");
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		System.out.println("answer the phone");
		
	}

	@Override
	public boolean callphone(int phonenum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isringing() {
		// TODO Auto-generated method stub
		System.out.println("calling num");
		return false;
	}

}
