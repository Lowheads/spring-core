package hello.core.member;

public interface MemberRepository {

    void save(Member member); // 멤버 저장 메서드

    Member findById(Long memberId); // 멤머 찾는 메서드
}
