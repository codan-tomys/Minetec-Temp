package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the "USER_UNDO_CURRENT" database table.
 * 
 */
@Embeddable
public class UserUndoCurrentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="\"USERNAME\"", insertable=false, updatable=false, unique=true, nullable=false, length=200)
	private String username;

	@Column(name="\"ID_OBJECT\"", unique=true, nullable=false)
	private Integer idObject;

	@Column(name="\"ID_OPERATION\"", unique=true, nullable=false)
	private Integer idOperation;

	public UserUndoCurrentPK() {
	}
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserUndoCurrentPK)) {
			return false;
		}
		UserUndoCurrentPK castOther = (UserUndoCurrentPK)other;
		return 
			this.username.equals(castOther.username)
			&& this.idObject.equals(castOther.idObject)
			&& this.idOperation.equals(castOther.idOperation);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.username.hashCode();
		hash = hash * prime + this.idObject.hashCode();
		hash = hash * prime + this.idOperation.hashCode();
		
		return hash;
	}
}