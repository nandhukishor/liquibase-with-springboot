package io.dickson.liquibasesample;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "databasechangelog")
public class DatabaseChangeLog {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String author;
	private String filename;
	private String DATEEXECUTED;
	private int ORDEREXECUTED;
	private String DEPLOYMENT_ID;
	private String LABELS;
	private String DESCRIPTION;
	private String MD5SUM;
	private String EXECTYPE;
	private String CONTEXTS;
	private String LIQUIBASE;
	private String TAG;
	private String COMMENTS;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getDATEEXECUTED() {
		return DATEEXECUTED;
	}

	public void setDATEEXECUTED(String dATEEXECUTED) {
		DATEEXECUTED = dATEEXECUTED;
	}

	public int getORDEREXECUTED() {
		return ORDEREXECUTED;
	}

	public void setORDEREXECUTED(int oRDEREXECUTED) {
		ORDEREXECUTED = oRDEREXECUTED;
	}

	public String getDEPLOYMENT_ID() {
		return DEPLOYMENT_ID;
	}

	public void setDEPLOYMENT_ID(String dEPLOYMENT_ID) {
		DEPLOYMENT_ID = dEPLOYMENT_ID;
	}

	public String getLABELS() {
		return LABELS;
	}

	public void setLABELS(String lABELS) {
		LABELS = lABELS;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public String getMD5SUM() {
		return MD5SUM;
	}

	public void setMD5SUM(String mD5SUM) {
		MD5SUM = mD5SUM;
	}

	public String getEXECTYPE() {
		return EXECTYPE;
	}

	public void setEXECTYPE(String eXECTYPE) {
		EXECTYPE = eXECTYPE;
	}

	public String getCONTEXTS() {
		return CONTEXTS;
	}

	public void setCONTEXTS(String cONTEXTS) {
		CONTEXTS = cONTEXTS;
	}

	public String getLIQUIBASE() {
		return LIQUIBASE;
	}

	public void setLIQUIBASE(String lIQUIBASE) {
		LIQUIBASE = lIQUIBASE;
	}

	public String getTAG() {
		return TAG;
	}

	public void setTAG(String tAG) {
		TAG = tAG;
	}

	public String getCOMMENTS() {
		return COMMENTS;
	}

	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}

}
