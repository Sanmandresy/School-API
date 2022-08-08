package fr.schoolapi.model;

import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Table
@Entity

public class Students {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id ;

  @Column(length = 200)
  private String name ;

  @ManyToOne
  private Groups groups  ;

}
