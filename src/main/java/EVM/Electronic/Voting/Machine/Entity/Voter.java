package EVM.Electronic.Voting.Machine.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="voter")

public class Voter
{
	@Id
	@Column(name="voterid")
	int voterid;
	@Column(name="name")
	String name;
	
	public Voter() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Voter(String name, int voterid) {
		super();
		this.name = name;
		this.voterid = voterid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVoterid() {
		return voterid;
	}
	public void setVoterid(int voterid) {
		this.voterid = voterid;
	}
	
	  

}
