package Testing_System;

public class TypeQuestion {
	private int typeID;
	Type_Name typeName;
	
	public TypeQuestion(int typeID, Type_Name typeName) {
		this.typeID = typeID;
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return 
				"TypeID: " + typeID + "\n"
				+"TypeName: " + typeName + "\n";
	}

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}
	
}
