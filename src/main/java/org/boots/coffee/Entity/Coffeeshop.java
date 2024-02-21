package org.boots.coffee.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "coffeeshop")
public class Coffeeshop {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "personid")
    private Long personid;
    @Column(name = "coffeeid")
    private Long coffeeid;
    @Column(name = "datetime")
    private LocalDateTime dateTime;

    public Coffeeshop(Long personid, Long coffeeid) {
        this.personid = personid;
        this.coffeeid = coffeeid;
    }

    @Override
    public String toString() {
        return "Coffeeshop{" +
                "id=" + id +
                ", personId=" + personid +
                ", coffeeId=" + coffeeid +
                ", dateTime=" + dateTime +
                '}';
    }
}
