package EVM.Electronic.Voting.Machine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EVM.Electronic.Voting.Machine.Entity.Voter;

public interface VoterRepository extends JpaRepository<Voter, Integer> {

}
