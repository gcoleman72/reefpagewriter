package au.gov.aims.ReefPageWriter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REEF_COMMENTS")
public class Comment {
	@Id
	private Integer id;

	@Column(name = "FULLREEF_ID")
	private String fullReefId;

	@Column(name = "LOCATION")
	private String location;

	@Column(name = "PARA_ID")
	private String paraId;

	@Column(name = "REAL_VISIT")
	private Integer realVisit;

	@Column(name = "SAMPLE_TYPE")
	private String sampleType;

	@Column(name = "P_CODE")
	private String pCode;

	@Column(name = "COMMENTS")
	private String comments;

	@Column(name = "PLOT")
	private String plot;

	@Column(name = "CUR")
	private String cur;

	@Column(name = "VISIT_NO")
	private Integer visitNo;

	public String getReefId() {
		return fullReefId;
	}

	public void setReefId(String reefId) {
		this.fullReefId = reefId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getParaId() {
		return paraId;
	}

	public void setParaId(String paraId) {
		this.paraId = paraId;
	}

	public Integer getRealVisit() {
		return realVisit;
	}

	public void setRealVisit(Integer realVisit) {
		this.realVisit = realVisit;
	}

	public String getSampleType() {
		return sampleType;
	}

	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getCur() {
		return cur;
	}

	public void setCur(String cur) {
		this.cur = cur;
	}

	@Override
	public String toString() {
		return "[reefId= " + fullReefId + "]"
				+ "[location= " + location + "]"
				+ "[paraId= " + paraId + "]"
				+ "[realVisit= " + realVisit + "]"
				+ "[sampleType= " + sampleType + "]"
				+ "[pCode= " + pCode + "]"
				+ "[plot= " + plot + "]"
				+ "[cur= " + cur + "]\n"
				+ "[comments= " + comments + "]\n"
				
				+ "--------------------------------------------------------------";
	}

}
