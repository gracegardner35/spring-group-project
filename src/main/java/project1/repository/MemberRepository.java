package project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project1.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}