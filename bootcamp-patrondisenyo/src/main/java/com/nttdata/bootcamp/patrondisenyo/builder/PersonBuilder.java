package com.nttdata.bootcamp.patrondisenyo.builder;

import lombok.Builder;

@Builder
public class PersonBuilder {
	private String name;
	private int age;

	private PersonBuilder(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private PersonBuilder(UserBuilder userBuilder) {
		this.name = userBuilder.name;
		this.age = userBuilder.age;
	}

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

	public Builder builder() {
		return null;
	}

	public static class UserBuilder {
		private String name;
		private int age;

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder name(String name) {
			this.name = name;
			return this;
		}

		public PersonBuilder build() {
			return new PersonBuilder(this);
		}
	}
}
