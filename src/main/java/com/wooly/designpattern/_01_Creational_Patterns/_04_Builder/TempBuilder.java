package com.wooly.designpattern._01_Creational_Patterns._04_Builder;

import java.util.ArrayList;
import java.util.List;

public class TempBuilder {
	private String name;
	private int age;
	private String gender;
	private List<String> more;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getMore() {
		return more;
	}

	public void setMore(List<String> more) {
		this.more = more;
	}


	public static Builder builder() {
		return new TempBuilder.Builder();
	}

	public static final class Builder {
		private String name;
		private int age;
		private String gender;
		private List<String> more;

		public Builder() {
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder more(String more) {
			if (this.more == null) {
				this.more = new ArrayList<>();
			}
			this.more.add(more);
			return this;
		}

		public TempBuilder build() {
			TempBuilder tempBuilder = new TempBuilder();
			tempBuilder.setName(name);
			tempBuilder.setGender(gender);
			tempBuilder.setAge(age);
			tempBuilder.setMore(more);
			return tempBuilder;
		}
	}


	@Override
	public String toString() {
		return "TempBuilder{" +
				"name='" + name + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				", more=" + more +
				'}';
	}


}
