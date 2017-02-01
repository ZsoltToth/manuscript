package manuscript.module.user.management.bean;

import java.util.List;

public class AdditionalData {

	private List<Role> defaultRoles;

	public AdditionalData(List<Role> defaultRoles) {
		super();
		this.defaultRoles = defaultRoles;
	}

	public AdditionalData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Role> getDefaultRoles() {
		return defaultRoles;
	}

	public void setDefaultRoles(List<Role> defaultRoles) {
		this.defaultRoles = defaultRoles;
	}

}
