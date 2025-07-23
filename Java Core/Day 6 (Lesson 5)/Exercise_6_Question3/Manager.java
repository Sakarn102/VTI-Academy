package Exercise_6_Question3;

import Exercise_6_Question2.User;

public class Manager extends User{

	public Manager(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double caculatePay() {
		return getSalaryRatio() * 520;
	}

}
