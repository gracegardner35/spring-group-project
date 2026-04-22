package project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project1.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
