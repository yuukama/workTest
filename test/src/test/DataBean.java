package test;

public class DataBean {
	
	public DataBean(String tenpoCd, String dateYmd, String uriage) {
		
		this.tenpoCd = tenpoCd;
		this.dateYmd = dateYmd;
		this.uriage = uriage;
	}
	
	private String tenpoCd = null;
	
	private String dateYmd = null;
	
	private String uriage = null;
	

	public String getTenpoCd() {
		return tenpoCd;
	}

	public void setTenpoCd(String tenpoCd) {
		this.tenpoCd = tenpoCd;
	}

	public String getDateYmd() {
		return dateYmd;
	}

	public void setDateYmd(String dateYmd) {
		this.dateYmd = dateYmd;
	}

	public String getUriage() {
		return uriage;
	}

	public void setUriage(String uriage) {
		this.uriage = uriage;
	}
}