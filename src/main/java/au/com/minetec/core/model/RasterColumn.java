package au.com.minetec.core.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Array;


/**
 * The persistent class for the raster_columns database table.
 * 
 */
@Entity
@Table(name="raster_columns")
@NamedQuery(name="RasterColumn.findAll", query="SELECT r FROM RasterColumn r")
public class RasterColumn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="blocksize_x")
	private Integer blocksizeX;

	@Column(name="blocksize_y")
	private Integer blocksizeY;

	private Object extent;

	@Column(name="nodata_values")
	private Array nodataValues;

	@Column(name="num_bands")
	private Integer numBands;

	@Column(name="out_db")
	private Array outDb;

	@Column(name="pixel_types", length=2147483647)
	private Array pixelTypes;

	@Column(name="r_raster_column", length=2147483647)
	private String rRasterColumn;

	@Column(name="r_table_catalog", length=2147483647)
	private String rTableCatalog;

	@Column(name="r_table_name", length=2147483647)
	private String rTableName;

	@Column(name="r_table_schema", length=2147483647)
	private String rTableSchema;

	@Column(name="regular_blocking")
	private Boolean regularBlocking;

	@Column(name="same_alignment")
	private Boolean sameAlignment;

	@Column(name="scale_x")
	private double scaleX;

	@Column(name="scale_y")
	private double scaleY;

	private Integer srid;

	public RasterColumn() {
	}

	public Integer getBlocksizeX() {
		return this.blocksizeX;
	}

	public void setBlocksizeX(Integer blocksizeX) {
		this.blocksizeX = blocksizeX;
	}

	public Integer getBlocksizeY() {
		return this.blocksizeY;
	}

	public void setBlocksizeY(Integer blocksizeY) {
		this.blocksizeY = blocksizeY;
	}

	public Object getExtent() {
		return this.extent;
	}

	public void setExtent(Object extent) {
		this.extent = extent;
	}

	public Array getNodataValues() {
		return this.nodataValues;
	}

	public void setNodataValues(Array nodataValues) {
		this.nodataValues = nodataValues;
	}

	public Integer getNumBands() {
		return this.numBands;
	}

	public void setNumBands(Integer numBands) {
		this.numBands = numBands;
	}

	public Array getOutDb() {
		return this.outDb;
	}

	public void setOutDb(Array outDb) {
		this.outDb = outDb;
	}

	public Array getPixelTypes() {
		return this.pixelTypes;
	}

	public void setPixelTypes(Array pixelTypes) {
		this.pixelTypes = pixelTypes;
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

	public Boolean getRegularBlocking() {
		return this.regularBlocking;
	}

	public void setRegularBlocking(Boolean regularBlocking) {
		this.regularBlocking = regularBlocking;
	}

	public Boolean getSameAlignment() {
		return this.sameAlignment;
	}

	public void setSameAlignment(Boolean sameAlignment) {
		this.sameAlignment = sameAlignment;
	}

	public double getScaleX() {
		return this.scaleX;
	}

	public void setScaleX(double scaleX) {
		this.scaleX = scaleX;
	}

	public double getScaleY() {
		return this.scaleY;
	}

	public void setScaleY(double scaleY) {
		this.scaleY = scaleY;
	}

	public Integer getSrid() {
		return this.srid;
	}

	public void setSrid(Integer srid) {
		this.srid = srid;
	}

}