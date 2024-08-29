package EVM.Electronic.Voting.Machine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import EVM.Electronic.Voting.Machine.Entity.Parties;

public interface PartiesRepository extends JpaRepository<Parties, Integer> {

}
