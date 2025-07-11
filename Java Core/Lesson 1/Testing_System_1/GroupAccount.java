package Testing_System;

import java.sql.Date;
import java.time.LocalDateTime;

public class GroupAccount {
	Group groupID;
	Account accountID;
	LocalDateTime joinDate;
	
	public GroupAccount(Group groupID, Account accountID, LocalDateTime joinDate) {
		this.groupID = groupID;
		this.accountID = accountID;
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return 
				"GroupID: " + groupID.getGroupID() + "\n"
				+"AccountID: " + accountID.getAccountID() + "\n"
				+"JoinDate: " + joinDate +"\n";
	}
}
