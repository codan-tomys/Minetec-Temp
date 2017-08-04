package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "SIGNS" database table.
 * 
 */
@Entity
@Table(name="\"SIGNS\"")
@NamedQuery(name="Sign.findAll", query="SELECT s FROM Sign s")
public class Sign implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID\"", unique=true, nullable=false)
	private Long id;

	@Column(name="\"ACTIVE\"")
	private Boolean active;

	@Column(name="\"DESCRIPTION\"", length=2000)
	private String description;

	@Column(name="\"IMAGE\"")
	private byte[] image;

	@Column(name="\"IMAGENAME\"", length=200)
	private String imagename;

	@Column(name="\"LOCATION\"")
	private Object location;

	@Column(name="\"MASTER_VERSION\"")
	private Long masterVersion;

	@Column(name="\"MTIME\"")
	private double mtime;

	@Column(name="\"NAME\"", nullable=false, length=200)
	private String name;

	@Column(name="\"ROLES\"")
	private Object roles;

	@Column(name="\"STATUS\"", length=1)
	private String status;

	@Column(name="\"TIMEEND\"")
	private Timestamp timeend;

	@Column(name="\"TIMESTART\"")
	private Timestamp timestart;

	@Column(name="\"VERSION\"", nullable=false)
	private Long version;

	@Column(name="\"ZONE\"", length=200)
	private String zone;

	public Sign() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getImagename() {
		return this.imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	public Object getLocation() {
		return this.location;
	}

	public void setLocation(Object location) {
		this.location = location;
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

	public Object getRoles() {
		return this.roles;
	}

	public void setRoles(Object roles) {
		this.roles = roles;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getTimeend() {
		return this.timeend;
	}

	public void setTimeend(Timestamp timeend) {
		this.timeend = timeend;
	}

	public Timestamp getTimestart() {
		return this.timestart;
	}

	public void setTimestart(Timestamp timestart) {
		this.timestart = timestart;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}