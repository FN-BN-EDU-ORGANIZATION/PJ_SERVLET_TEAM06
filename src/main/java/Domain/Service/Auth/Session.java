package Domain.Service.Auth;

public class Session {
	
	private String res_id; 	//세션id
	private String id;		//유저 id
	private String role;	//회원 관리자 역할구분
	
	public Session() {
		super();
	}

	public Session(String res_id, String id, String role) {
		super();
		this.res_id = res_id;
		this.id = id;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Session [res_id=" + res_id + ", id=" + id + ", role=" + role + "]";
	}

	public String getRes_id() {
		return res_id;
	}

	public void setRes_id(String res_id) {
		this.res_id = res_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
