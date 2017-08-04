package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "MINES" database table.
 * 
 */
@Entity
@Table(name="\"MINES\"")
@NamedQuery(name="Mine.findAll", query="SELECT m FROM Mine m")
public class Mine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID\"", unique=true, nullable=false)
	private Long id;

	@Column(name="\"DESCRIPTION\"", length=1000)
	private String description;

	@Column(name="\"ID_UPLOAD\"")
	private Long idUpload;

	@Column(name="\"MASTER_VERSION\"")
	private Long masterVersion;

	@Column(name="\"MTIME\"")
	private double mtime;

	@Column(name="\"NAME\"", length=200)
	private String name;

	@Column(name="\"PROPERTIES\"")
	private Object properties;

	@Column(name="\"ROUTES_DATA\"", length=2147483647)
	private String routesData;

	@Column(name="\"VERSION\"", nullable=false)
	private Long version;

	public Mine() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getIdUpload() {
		return this.idUpload;
	}

	public void setIdUpload(Long idUpload) {
		this.idUpload = idUpload;
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

	public String getRoutesData() {
		return this.routesData;
	}

	public void setRoutesData(String routesData) {
		this.routesData = routesData;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}