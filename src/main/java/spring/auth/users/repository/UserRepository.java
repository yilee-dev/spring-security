package spring.auth.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.auth.domain.entity.Account;

public interface UserRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
