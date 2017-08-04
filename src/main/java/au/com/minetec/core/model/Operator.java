package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "OPERATORS" database table.
 * 
 */
@Entity
@Table(name="\"OPERATORS\"")
@NamedQuery(name="Operator.findAll", query="SELECT o FROM Operator o")
public class Operator implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID\"", unique=true, nullable=false)
	private Integer id;

	@Column(name="\"DESCRIPTION\"", length=1000)
	private String description;

	@Column(name="\"DISPLAY_TYPE\"")
	private Integer displayType;

	@Column(name="\"MASTER_VERSION\"")
	private Long masterVersion;

	@Column(name="\"MTIME\"")
	private double mtime;

	@Column(name="\"NAME\"", length=200)
	private String name;

	@Column(name="\"PROPERTIES\"")
	private Object properties;

	@Column(name="\"STATUS\"", nullable=false, length=1)
	private String status;

	@Column(name="\"VERSION\"", nullable=false)
	private Long version;

	@Column(name="\"ZONE_PERMISSIONS\"")
	private Object zonePermissions;

	//uni-directional many-to-one association to OperatorType
	@ManyToOne
	@JoinColumns({
		})
	private OperatorType operatorType;

	public Operator() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDisplayType() {
		return this.displayType;
	}

	public void setDisplayType(Integer displayType) {
		this.displayType = displayType;
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

	public Object getZonePermissions() {
		return this.zonePermissions;
	}

	public void setZonePermissions(Object zonePermissions) {
		this.zonePermissions = zonePermissions;
	}

	public OperatorType getOperatorType() {
		return this.operatorType;
	}

	public void setOperatorType(OperatorType operatorType) {
		this.operatorType = operatorType;
	}

}