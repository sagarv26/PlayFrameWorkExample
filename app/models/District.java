package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name = "district")
public class District extends Model {

   
	@Id
    @Column
    public Long id_dist;

    @Column
    public String district_name;

}
