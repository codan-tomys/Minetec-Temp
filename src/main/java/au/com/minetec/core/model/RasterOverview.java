package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the raster_overviews database table.
 * 
 */
@Entity
@Table(name="raster_overviews")
@NamedQuery(name="RasterOverview.findAll", query="SELECT r FROM RasterOverview r")
public class RasterOverview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="o_raster_column", length=2147483647)
	private String oRasterColumn;

	@Column(name="o_table_catalog", length=2147483647)
	private String oTableCatalog;

	@Column(name="o_table_name", length=2147483647)
	private String oTableName;

	@Column(name="o_table_schema", length=2147483647)
	private String oTableSchema;

	@Column(name="overview_factor")
	private Integer overviewFactor;

	@Column(name="r_raster_column", length=2147483647)
	private String rRasterColumn;

	@Column(name="r_table_catalog", length=2147483647)
	private String rTableCatalog;

	@Column(name="r_table_name", length=2147483647)
	private String rTableName;

	@Column(name="r_table_schema", length=2147483647)
	private String rTableSchema;

	public RasterOverview() {
	}

	public String getORasterColumn() {
		return this.oRasterColumn;
	}

	public void setORasterColumn(String oRasterColumn) {
		this.oRasterColumn = oRasterColumn;
	}

	public String getOTableCatalog() {
		return this.oTableCatalog;
	}

	public void setOTableCatalog(String oTableCatalog) {
		this.oTableCatalog = oTableCatalog;
	}

	public String getOTableName() {
		return this.oTableName;
	}

	public void setOTableName(String oTableName) {
		this.oTableName = oTableName;
	}

	public String getOTableSchema() {
		return this.oTableSchema;
	}

	public void setOTableSchema(String oTableSchema) {
		this.oTableSchema = oTableSchema;
	}

	public Integer getOverviewFactor() {
		return this.overviewFactor;
	}

	public void setOverviewFactor(Integer overviewFactor) {
		this.overviewFactor = overviewFactor;
	}

	public String getRRasterColumn() {
		return this.rRasterColumn;
	}

	public void setRRasterColumn(String rRasterColumn) {
		this.rRasterColumn = rRasterColumn;
	}

	public String getRTableCatalog() {
		return this.rTableCatalog;
	}

	public void setRTableCatalog(String rTableCatalog) {
		this.rTableCatalog = rTableCatalog;
	}

	public String getRTableName() {
		return this.rTableName;
	}

	public void setRTableName(String rTableName) {
		this.rTableName = rTableName;
	}

	public String getRTableSchema() {
		return this.rTableSchema;
	}

	public void setRTableSchema(String rTableSchema) {
		this.rTableSchema = rTableSchema;
	}

}