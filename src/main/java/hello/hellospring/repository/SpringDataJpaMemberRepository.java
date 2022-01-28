package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//구현체가 자동으로 만들어서 등록해줌
public interface SpringDataJpaMemberRepository extends JpaRepository<Member,Long>,MemberRepository{
    @Override
    Optional<Member> findByName(String name);

}
