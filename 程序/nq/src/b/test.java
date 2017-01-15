package b;

public class test {
    String no;
    String name;
    String sex;
    String phone;
    String address;
    String email;
    String photopath;
	public String getPhotopath() {
		return photopath;
	}
	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public test(String no, String name, String sex, String phone,
			String address, String email, String photopath) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.photopath = photopath;
	}
	@Override
	public String toString() {
		return "Txl [address=" + address + ", email=" + email + ", name="
				+ name + ", no=" + no + ", phone=" + phone + ", photopath="
				+ photopath + ", sex=" + sex + "]";
	}
	public test() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
