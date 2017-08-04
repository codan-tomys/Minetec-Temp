package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "DB_VERSION" database table.
 * 
 */
@Entity
@Table(name="\"DB_VERSION\"")
@NamedQuery(name="DbVersion.findAll", query="SELECT d FROM DbVersion d")
public class DbVersion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false)
	private Integer increment;

	@Column(length=100)
	private String lastscript;

	@Column(nullable=false)
	private Integer major;

	@Column(nullable=false)
	private Integer minor;

	public DbVersion() {
	}

	public Integer getIncrement() {
		return this.increment;
	}

	public void setIncrement(Integer increment) {
		this.increment = increment;
	}

	public String getLastscript() {
		return this.lastscript;
	}

	public void setLastscript(String lastscript) {
		this.lastscript = lastscript;
	}

	public Integer getMajor() {
		return this.major;
	}

	public void setMajor(Integer major) {
		this.major = major;
	}

	public Integer getMinor() {
		return this.minor;
	}

	public void setMinor(Integer minor) {
		this.minor = minor;
	}

}