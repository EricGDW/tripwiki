package com.itucity.tripwiki.base;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlAttribute;

public abstract class BaseModel implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6098508370913036498L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@OrderBy("id")
	private Integer id;

	/**
	 * 是否使用反射代理
	 */
	@Transient
	private boolean proxy = false;

	/**
	 * 对象的版本号，修改之后自增一;i++
	 */
	@Version
	private Integer version;

	/**
	 * 对象的别名，以便需要特殊的需要查询有中文问题的时候，
	 * 使用他的别名查询可以准确的查询到结果
	 */
	private String modelAlias;
	private String des;

	/**
	 * 搜索字符串集合
	 * 
	 * @return
	 */
	public List<String> getSearchProperties() {
		return null;
	}

	public BaseModel clone() throws CloneNotSupportedException {
		return ((BaseModel) super.clone());
	}

	@XmlAttribute
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof BaseModel))
			return false;
		BaseModel model = (BaseModel) obj;
		return (model.getId() == getId());
	}

	public int hashCode() {
		if (this.id == null)
			this.id = Integer.valueOf(-1);
		return new Integer(this.id.intValue() + 1000).hashCode();
	}

	public String toString() {
		return getMetaData() + getId();
	}

	public abstract String getMetaData();

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getModelAlias() {
		return modelAlias;
	}

	public void setModelAlias(String modelAlias) {
		this.modelAlias = modelAlias;
	}

	public boolean isProxy() {
		return proxy;
	}

	public void setProxy(boolean isProxy) {
		this.proxy = isProxy;
	}

}
