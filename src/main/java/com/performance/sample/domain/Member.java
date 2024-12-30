package com.performance.sample.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "t_member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "age", length = 5)
    private int age;

    @Column(name = "address", length = 200)
    private String address;

    @Column(name = "gender", length = 5)
    private String gender;


    @Builder
    public Member(String name, int age, String address, String gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public static Member signup(String name){
        Member member = Member.builder()
                .name(name)
                .age(30)
                .address("korea seoul")
                .gender("M")
                .build();
        return member;
    }

}
