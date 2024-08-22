package at.spengergasse.observable.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GenericEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int ident;
    
    String genericVal;
}
