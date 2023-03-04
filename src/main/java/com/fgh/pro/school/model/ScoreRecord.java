package com.fgh.pro.school.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "score")
public class ScoreRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_semester")
    private float firstSemester;

    @Column(name = "second_semester")
    private float secondSemester;

    @Column(name = "third_semester")
    private float thirdSemester;

    @Column(name = "final_semester")
    private float finalGrade;

    @Column(name = "year")
    private Date year;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "updated_on")
    private Instant updatedOn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ScoreRecord that = (ScoreRecord) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
