package fr.schoolapi.model;


import javax.persistence.*;
import java.util.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity

public class Groups {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id ;

  @Column(name = "group_name",length = 3)
  private String name ;

  @Column
  private Date creationDate ;
}
