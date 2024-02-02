package com.bg.bzahov.achievementsBG.model;

//import jakarta.persistence.*;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class RowerIDCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rowerID",nullable = false)
    private Rower rowerID;

    @Column( unique = true, nullable = false)
    private String cardNumber;
}