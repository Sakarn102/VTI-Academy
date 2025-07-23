package Exercise_6_Question3;

import Exercise_6_Question2.User;

public class Waiter extends User{

	public Waiter(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double caculatePay() {
		return getSalaryRatio() * 220;
	}
	

}
