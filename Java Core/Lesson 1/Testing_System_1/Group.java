package Testing_System;

import java.time.LocalDateTime;

public class Group {
	private int groupID;
	private String groupName;
	Account creatorID;
	LocalDateTime createDate;

	public Group(int groupID, String groupName, Account creatorID, LocalDateTime createDate) {
		this.groupID = groupID;
		this.groupName = groupName;
		this.creatorID = creatorID;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return
				"GroupID: " + groupID + "\n"
				+"GroupName: " + groupName + "\n"
				+"CreatorID: " + creatorID.getAccountID() +"\n"
				+ "CreateDate: " + createDate +"\n";
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}
	
}
