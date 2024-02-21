package org.boots.coffee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private Long id;
    @Column(name = "personid")
    private Long personid;
    @Column(name = "coffeeid")
    private Long coffeeid;
    @Column(name = "datetime")
    private LocalDateTime dateTime;

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
