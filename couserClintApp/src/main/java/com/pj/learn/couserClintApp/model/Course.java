package com.pj.learn.couserClintApp.model;

        import com.netflix.discovery.converters.Auto;
        import lombok.Data;

        import javax.persistence.*;

@Entity
@Data
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Course_id")
    Long courseId;
    @Column(name = "userid")
    Long uId;
    @Column(name = "course_name")
    String courseName;
}
