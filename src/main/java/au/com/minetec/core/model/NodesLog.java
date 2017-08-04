package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "NODES_LOG" database table.
 * 
 */
@Entity
@Table(name="\"NODES_LOG\"")
@NamedQuery(name="NodesLog.findAll", query="SELECT n FROM NodesLog n")
public class NodesLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"ID\"", nullable=false)
	private Long id;

	@Column(name="\"MTIME\"")
	private double mtime;

	@Column(name="\"VALUE\"", length=2147483647)
	private String value;

	public NodesLog() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getMtime() {
		return this.mtime;
	}

	public void setMtime(double mtime) {
		this.mtime = mtime;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}