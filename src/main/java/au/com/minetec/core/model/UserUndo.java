package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "USER_UNDO" database table.
 * 
 */
@Entity
@Table(name="\"USER_UNDO\"")
@NamedQuery(name="UserUndo.findAll", query="SELECT u FROM UserUndo u")
public class UserUndo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID\"", unique=true, nullable=false)
	private Long id;

	@Column(name="\"BACKWARD\"", length=2147483647)
	private String backward;

	@Column(name="\"FORWARD\"", length=2147483647)
	private String forward;

	@Column(name="\"ID_OBJECT\"", nullable=false)
	private Integer idObject;

	@Column(name="\"ID_OPERATION\"", nullable=false)
	private Integer idOperation;

	@Column(name="\"TYPE\"", nullable=false)
	private Integer type;

	@Column(name="\"USERNAME\"", nullable=false, length=200)
	private String username;

	//uni-directional many-to-one association to User
	@ManyToOne
	@JoinColumns({
		})
	private User user;

	public UserUndo() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBackward() {
		return this.backward;
	}

	public void setBackward(String backward) {
		this.backward = backward;
	}

	public String getForward() {
		return this.forward;
	}

	public void setForward(String forward) {
		this.forward = forward;
	}

	public Integer getIdObject() {
		return this.idObject;
	}

	public void setIdObject(Integer idObject) {
		this.idObject = idObject;
	}

	public Integer getIdOperation() {
		return this.idOperation;
	}

	public void setIdOperation(Integer idOperation) {
		this.idOperation = idOperation;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}