package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the geography_columns database table.
 * 
 */
@Entity
@Table(name="geography_columns")
@NamedQuery(name="GeographyColumn.findAll", query="SELECT g FROM GeographyColumn g")
public class GeographyColumn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="coord_dimension")
	private Integer coordDimension;

	@Column(name="f_geography_column", length=2147483647)
	private String fGeographyColumn;

	@Column(name="f_table_catalog", length=2147483647)
	private String fTableCatalog;

	@Column(name="f_table_name", length=2147483647)
	private String fTableName;

	@Column(name="f_table_schema", length=2147483647)
	private String fTableSchema;

	private Integer srid;

	@Column(length=2147483647)
	private String type;

	public GeographyColumn() {
	}

	public Integer getCoordDimension() {
		return this.coordDimension;
	}

	public void setCoordDimension(Integer coordDimension) {
		this.coordDimension = coordDimension;
	}

	public String getFGeographyColumn() {
		return this.fGeographyColumn;
	}

	public void setFGeographyColumn(String fGeographyColumn) {
		this.fGeographyColumn = fGeographyColumn;
	}

	public String getFTableCatalog() {
		return this.fTableCatalog;
	}

	public void setFTableCatalog(String fTableCatalog) {
		this.fTableCatalog = fTableCatalog;
	}

	public String getFTableName() {
		return this.fTableName;
	}

	public void setFTableName(String fTableName) {
		this.fTableName = fTableName;
	}

	public String getFTableSchema() {
		return this.fTableSchema;
	}

	public void setFTableSchema(String fTableSchema) {
		this.fTableSchema = fTableSchema;
	}

	public Integer getSrid() {
		return this.srid;
	}

	public void setSrid(Integer srid) {
		this.srid = srid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}