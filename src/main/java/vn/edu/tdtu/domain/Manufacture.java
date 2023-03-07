package vn.edu.tdtu.domain;
import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Entity
@Table(name = "manufacture")
@Setter @Getter
public class Manufacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String location;

    @Column
    private int employee;

    @OneToMany(mappedBy = "manufacture",cascade = CascadeType.ALL)
    private List<Phone>  phones;

    public Manufacture(int id, String name, String location, int employee , List<Phone> phones) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.employee = employee;
        this.phones = phones;
    }
}
