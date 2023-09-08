package com.itacademy.java_classes.interface_1;

import java.util.Objects;

public abstract class MediaFile implements Reproducible {
	
	private String name;
	private String fileExpansion;
	private int timeOfReproducingInMinutes;
	
	public MediaFile() {}
	
	public MediaFile(String name, String fileExpansion, int timeOfReproducingInMinutes) {
		this.name = name;
		this.fileExpansion = fileExpansion;
		this.timeOfReproducingInMinutes = timeOfReproducingInMinutes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFileExpansion() {
		return fileExpansion;
	}

	public void setFileExpansion(String fileExpansion) {
		this.fileExpansion = fileExpansion;
	}

	public int getTimeOfReproducingInMinutes() {
		return timeOfReproducingInMinutes;
	}

	public void setTimeOfReproducingInMinutes(int timeOfReproducingInMinutes) {
		this.timeOfReproducingInMinutes = timeOfReproducingInMinutes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fileExpansion, name, timeOfReproducingInMinutes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MediaFile other = (MediaFile) obj;
		return Objects.equals(fileExpansion, other.fileExpansion) && Objects.equals(name, other.name)
				&& timeOfReproducingInMinutes == other.timeOfReproducingInMinutes;
	}

	@Override
	public String toString() {
		return "MediaFile [name=" + name + ", fileExpansion=" + fileExpansion + ", timeOfReproducingInMinutes="
				+ timeOfReproducingInMinutes + "]";
	}
	
	

}
