package org.baeldung.persistence.dao;

import org.baeldung.persistence.model.User;
import org.baeldung.persistence.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

    VerificationToken findByToken(String token);

    VerificationToken findByUser(User user);

}
