package EVM.Electronic.Voting.Machine.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="commissioner")
public class Commissioner {
	@Id
	@Column
	int commissionerid;
	@Column
	String password;
	
	public Commissioner() {
		// TODO Auto-generated constructor stub
	}

	public Commissioner(int commissionerid, String password) {
		super();
		this.commissionerid = commissionerid;
		this.password = password;
	}

	public int getCommissionerid() {
		return commissionerid;
	}

	public void setCommissionerid(int commissionerid) {
		this.commissionerid = commissionerid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
