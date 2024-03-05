package hello.coreparrot.member;

//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;

//Entity // 이 클래스를 테이블과 매핑한다고 JPA에 알려줌 -> 이걸 사용함으로써 Member 클래스는 엔티티 클래스라고 함
//@Table(name = "MEMBER") // 엔티티 클래스에 매핑할 테이블 정보를 알려줌 , 이 어노테이션을 생략하면 클래스 이름을 테이블 이름으로 매핑
public class Member {

//    @Id // 엔티티 클래스의 필드를 테이블의 기본 키에 매핑 -> 이걸 사용함으로써 id 필드는 식별자 필드라고 함
//    @Column(name = "ID")
    private Long id;

//    @Column(name = "NAME") // 필드를 컬럼에 매핑
    private String name;


    private Grade grade;

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Member() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
