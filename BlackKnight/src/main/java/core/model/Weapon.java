package core.model;

import javax.persistence.*;

@Entity
public class Weapon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String type;

    public int getId() {
        return this.id;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public String setType(String type) {
        return this.type = type;
    }

}
