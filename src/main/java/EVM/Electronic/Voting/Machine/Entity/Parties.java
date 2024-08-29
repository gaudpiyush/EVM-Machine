package EVM.Electronic.Voting.Machine.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="parties")
public class Parties {
	
	@Id
	@Column(name="s_no")
	int s_no;
	@Column(name="partyname")
	String partyname;
	public Parties() {
		// TODO Auto-generated constructor stub
	}
	public Parties(int s_no, String partyname) {
		super();
		this.s_no = s_no;
		this.partyname = partyname;
	}
	
	public int getS_no() {
		return s_no;
	}
	public void setS_no(int s_no) {
		this.s_no = s_no;
	}
	public String getPartyname() {
		return partyname;
	}
	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}
	
	@Override
	public String toString() {
		return "Parties [s_no=" + s_no + ", partyname=" + partyname + "]";
	}
	
	

}
