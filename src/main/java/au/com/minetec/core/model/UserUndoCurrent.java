package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "USER_UNDO_CURRENT" database table.
 * 
 */
@Entity
@Table(name="\"USER_UNDO_CURRENT\"")
@NamedQuery(name="UserUndoCurrent.findAll", query="SELECT u FROM UserUndoCurrent u")
public class UserUndoCurrent implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserUndoCurrentPK id;

	@Column(name="\"CURRENT\"", nullable=false)
	private Integer current;

	//uni-directional many-to-one association to User
	@ManyToOne
	@JoinColumns({
		})
	private User user;

	public UserUndoCurrent() {
	}

	public UserUndoCurrentPK getId() {
		return this.id;
	}

	public void setId(UserUndoCurrentPK id) {
		this.id = id;
	}

	public Integer getCurrent() {
		return this.current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}