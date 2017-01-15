package b;

public class user {
	 String uname;
	 String upwd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public user(String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", upwd=" + upwd + "]";
	}
	 
}
