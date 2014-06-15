package wollits.hibernate;

// Generated Jun 14, 2014 7:45:27 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * LocationTypes generated by hbm2java
 */
@Entity
@Table(name = "location_types", catalog = "wollits")
public class LocationTypes implements java.io.Serializable {

	private int locationTypeId;
	private String name;
	private Set<Locations> locationses = new HashSet<Locations>(0);

	public LocationTypes() {
	}

	public LocationTypes(int locationTypeId, String name) {
		this.locationTypeId = locationTypeId;
		this.name = name;
	}

	public LocationTypes(int locationTypeId, String name,
			Set<Locations> locationses) {
		this.locationTypeId = locationTypeId;
		this.name = name;
		this.locationses = locationses;
	}

	@Id
	@Column(name = "location_type_id", unique = true, nullable = false)
	public int getLocationTypeId() {
		return this.locationTypeId;
	}

	public void setLocationTypeId(int locationTypeId) {
		this.locationTypeId = locationTypeId;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locationTypes")
	public Set<Locations> getLocationses() {
		return this.locationses;
	}

	public void setLocationses(Set<Locations> locationses) {
		this.locationses = locationses;
	}

}