package serializeanddeserialize;

import java.io.Serializable;

public class Parent implements Serializable {
	int eid;
	String parentName;

	protected Parent() {

	}

	public Parent(int eid, String parentName) {

		this.eid = eid;
		this.parentName = parentName;
	}

}
