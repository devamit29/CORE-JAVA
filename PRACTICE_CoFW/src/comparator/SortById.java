package comparator;

import java.util.Comparator;

public class SortById implements Comparator<Student> {
	 @Override
	public int compare(Student o1, Student o2) {
		if (o1.id>o2.id) {
			return 1;
		} else if(o1.id<o2.id){
			return -1;

		}else {
		return o1.name.compareTo(o2.name);
		}
	}
	 

}
