package comparableandcomparatorinterface;

public class Student implements Comparable<Student>{
	
	int sid;
	String name;
	String address;
	
	public Student(int sid,String name,String address){
		this.sid=sid;
		this.name=name;
		this.address=address;
	}
	@Override
	public int compareTo(Student o) {
		//-1 0 1
		//id==id=0
		//id>id=1
		//id<id=-1
		
		/*if(sid>o.sid)
		{
			return 1;
		}else if(sid==o.sid) {
			return 0;
		}else {
			return -1;
		}*/
		return name.compareTo(o.name);
	}
	

}
