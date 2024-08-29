package EVM.Electronic.Voting.Machine.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EVM.Electronic.Voting.Machine.Entity.Commissioner;

public interface CommissionerRepository extends JpaRepository<Commissioner, Integer> {

	boolean existsByPassword(String password);

}
