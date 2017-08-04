package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "TRACKING_LOGS" database table.
 * 
 */
@Entity
@Table(name="\"TRACKING_LOGS\"")
@NamedQuery(name="TrackingLog.findAll", query="SELECT t FROM TrackingLog t")
public class TrackingLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID\"", unique=true, nullable=false)
	private Long id;

	@Column(name="\"LOG_MSG\"", nullable=false)
	private Object logMsg;

	@Column(name="\"LOG_NOTES\"", nullable=false, length=2000)
	private String logNotes;

	@Column(name="\"LOG_TIME\"", nullable=false)
	private Timestamp logTime;

	@Column(name="\"LOG_TYPE\"", nullable=false, length=50)
	private String logType;

	@Column(name="\"MASTER_VERSION\"")
	private Long masterVersion;

	@Column(name="\"MTIME\"")
	private double mtime;

	@Column(name="\"OPERATORID\"", nullable=false)
	private Long operatorid;

	@Column(name="\"VEHICLE_DETAILS\"", nullable=false)
	private Object vehicleDetails;

	@Column(name="\"VEHICLEID\"", nullable=false)
	private Long vehicleid;

	@Column(name="\"VERSION\"", nullable=false)
	private Long version;

	public TrackingLog() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Object getLogMsg() {
		return this.logMsg;
	}

	public void setLogMsg(Object logMsg) {
		this.logMsg = logMsg;
	}

	public String getLogNotes() {
		return this.logNotes;
	}

	public void setLogNotes(String logNotes) {
		this.logNotes = logNotes;
	}

	public Timestamp getLogTime() {
		return this.logTime;
	}

	public void setLogTime(Timestamp logTime) {
		this.logTime = logTime;
	}

	public String getLogType() {
		return this.logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
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

	public Long getOperatorid() {
		return this.operatorid;
	}

	public void setOperatorid(Long operatorid) {
		this.operatorid = operatorid;
	}

	public Object getVehicleDetails() {
		return this.vehicleDetails;
	}

	public void setVehicleDetails(Object vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public Long getVehicleid() {
		return this.vehicleid;
	}

	public void setVehicleid(Long vehicleid) {
		this.vehicleid = vehicleid;
	}

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}