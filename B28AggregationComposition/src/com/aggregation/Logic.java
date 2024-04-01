package com.aggregation;

public class Logic {
	public static void main(String[] args) {
		// Settlement dept->>>20 emp
		Dept dept = new Dept();
		dept.setDid(1001);
		dept.setDeptName("Settlement Dept");
		Dept dept2 = new Dept();
		dept2.setDid(2001);
		dept2.setDeptName("Switch Dept");
		Employee e = new Employee();
		e.setId(11);
		e.setEname("Amar");
		e.setDept(dept);

		Employee e2 = new Employee();
		e2.setId(12);
		e2.setEname("Amit");
		e2.setDept(dept2);

		System.out
				.println(e.getId() + " " + e.getEname() + " " + e.getDept().getDeptName() + " " + e.getDept().getDid());
		System.out.println(
				e2.getId() + " " + e2.getEname() + " " + e2.getDept().getDeptName() + " " + e2.getDept().getDid());
	}

}
