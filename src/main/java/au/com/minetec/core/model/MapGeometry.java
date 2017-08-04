package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Array;


/**
 * The persistent class for the "MAP_GEOMETRY" database table.
 * 
 */
@Entity
@Table(name="\"MAP_GEOMETRY\"")
@NamedQuery(name="MapGeometry.findAll", query="SELECT m FROM MapGeometry m")
public class MapGeometry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID\"", unique=true, nullable=false)
	private Long id;

	@Column(name="\"DESCRIPTION\"", length=1000)
	private String description;

	@Column(name="\"GEOMETRY\"")
	private Object geometry;

	@Column(name="\"HASH\"")
	private Long hash;

	@Column(name="\"ID_MAP\"", nullable=false)
	private Long idMap;

	@Column(name="\"LABELS\"", length=200)
	private Array labels;

	@Column(name="\"MASTER_VERSION\"")
	private Long masterVersion;

	@Column(name="\"MTIME\"")
	private double mtime;

	@Column(name="\"PROPERTIES\"")
	private Object properties;

	@Column(name="\"VERSION\"", nullable=false)
	private Long version;

	//uni-directional many-to-one association to Mine
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumns({
		})
	private Mine mine;

	public MapGeometry() {
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

	public Object getGeometry() {
		return this.geometry;
	}

	public void setGeometry(Object geometry) {
		this.geometry = geometry;
	}

	public Long getHash() {
		return this.hash;
	}

	public void setHash(Long hash) {
		this.hash = hash;
	}

	public Long getIdMap() {
		return this.idMap;
	}

	public void setIdMap(Long idMap) {
		this.idMap = idMap;
	}

	public Array getLabels() {
		return this.labels;
	}

	public void setLabels(Array labels) {
		this.labels = labels;
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

	public Object getProperties() {
		return this.properties;
	}

	public void setProperties(Object properties) {
		this.properties = properties;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Mine getMine() {
		return this.mine;
	}

	public void setMine(Mine mine) {
		this.mine = mine;
	}

}