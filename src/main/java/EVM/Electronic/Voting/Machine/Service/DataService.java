package EVM.Electronic.Voting.Machine.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EVM.Electronic.Voting.Machine.Entity.Commissioner;
import EVM.Electronic.Voting.Machine.Entity.Parties;
import EVM.Electronic.Voting.Machine.Entity.Voter;
import EVM.Electronic.Voting.Machine.Repository.CommissionerRepository;
import EVM.Electronic.Voting.Machine.Repository.PartiesRepository;
import EVM.Electronic.Voting.Machine.Repository.VoterRepository;

@Service
public class DataService {
	@Autowired
	VoterRepository repo;
	@Autowired
	PartiesRepository prepo;
	
	@Autowired
	CommissionerRepository crepo;
	
	public boolean insertvoter(Voter v)
	{
		if(repo.existsById(v.getVoterid()))
		{
			return false;
		}
		else
		{
			repo.save(v);
			return true;
		}
		
	}
	
	public void insertvote(Parties p)
	{
		prepo.save(p);
	}
	public boolean validate(Commissioner c)
	{
		if(crepo.existsById(c.getCommissionerid()) && crepo.existsByPassword(c.getPassword()))
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	
	public List<Parties> getresult()
	{
		List<Parties> result=prepo.findAll();
		return result;
	}
	

}
