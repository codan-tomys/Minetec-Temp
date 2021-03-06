package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ZONES" database table.
 * 
 */
@Entity
@Table(name="\"ZONES\"")
@NamedQuery(name="Zone.findAll", query="SELECT z FROM Zone z")
public class Zone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID\"", unique=true, nullable=false)
	private Long id;

	@Column(name="\"COLOUR\"", length=200)
	private String colour;

	@Column(name="\"DESCRIPTION\"", length=2000)
	private String description;

	@Column(name="\"MASTER_VERSION\"")
	private Long masterVersion;

	@Column(name="\"MTIME\"")
	private double mtime;

	@Column(name="\"NAME\"", nullable=false, length=200)
	private String name;

	@Column(name="\"PROPERTIES\"")
	private Object properties;

	@Column(name="\"STATUS\"", length=1)
	private String status;

	@Column(name="\"VERSION\"", nullable=false)
	private Long version;

	@Column(name="\"ZONESTATUS\"", length=200)
	private String zonestatus;

	public Zone() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getMasterVersion() {
		return this.masterVersion;
	}

	public void setMasterVersion(Long masterVersion) {
		this.masterVersion = masterVersion;
	}

	public double getMtime() {
		return this.mtime;
	}

	public void setMtime(double mtime) {
		this.mtime = mtime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getProperties() {
		return this.properties;
	}

	public void setProperties(Object properties) {
		this.properties = properties;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getZonestatus() {
		return this.zonestatus;
	}

	public void setZonestatus(String zonestatus) {
		this.zonestatus = zonestatus;
	}

}