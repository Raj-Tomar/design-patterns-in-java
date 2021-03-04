package design.pattern.creational.prototype;

import java.util.List;

public class Statement implements Cloneable {
	private String sql;
	private List<String> parameters;
	private Records record;
	
	public Statement(String sql, List<String> parameters, Records record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}

	public Statement clone() {
		try {
			return (Statement) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getSql() {
		return sql;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public Records getRecord() {
		return record;
	}

	
}