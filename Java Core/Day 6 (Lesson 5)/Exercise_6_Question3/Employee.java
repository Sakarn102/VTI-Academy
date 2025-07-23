package Exercise_6_Question3;

import Exercise_6_Question2.*;

public class Employee extends User{

	
	public Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double caculatePay() {
		return getSalaryRatio() * 420;
	}
	
}
