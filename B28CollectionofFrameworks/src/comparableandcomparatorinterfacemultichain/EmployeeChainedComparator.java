package comparableandcomparatorinterfacemultichain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeChainedComparator implements Comparator<Employee>{
	List<Comparator<Employee>>listComparators;
	
	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.salary>o2.salary) {
			return 1;
		}else if(o1.salary<o2.salary) {
			return -1;
		}else
		return o1.ename.compareTo(o2.ename);
	}
	

}
