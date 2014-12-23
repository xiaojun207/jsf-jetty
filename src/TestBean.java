/**
 * 
 */

/**
 * @author xiaojun
 * @date 2014-1-20
 */
@javax.faces.bean.ManagedBean
@javax.faces.bean.SessionScoped
public class TestBean implements java.io.Serializable {
	private java.lang.String name = "";
	private java.lang.String version = "20140120";

	public TestBean() {

	}

	public java.lang.String getName() {
		return name + "-test";
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getVersion() {
		return version;
	}

	public void setVersion(java.lang.String version) {
		this.version = version;
	}
}
