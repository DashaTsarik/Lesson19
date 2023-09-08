package com.itacademy.java_classes.interface_1;

import java.util.Objects;

public class Podcast extends MediaFile{
	
	private String typeOfPodcast;
	
	public Podcast() {
		super();
	}
	
	public Podcast(String name, String fileExpansion, int timeOfReproducingInMinutes, String typeOfPodcast) {
		super(name, fileExpansion, timeOfReproducingInMinutes);
		this.typeOfPodcast = typeOfPodcast;
	}
	
	public String getTypeOfPodcast() {
		return typeOfPodcast;
	}

	public void setTypeOfPodcast(String typeOfPodcast) {
		this.typeOfPodcast = typeOfPodcast;
	}

	@Override
	public void play() {
		System.out.println("Start podcast playback");
		
	}

	@Override
	public void pause() {
		System.out.println("Pause podcast playback");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop podcast playback");
		
	}

	@Override
	public void rewind() {
		System.out.println("Rewind podcast");
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(typeOfPodcast);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Podcast other = (Podcast) obj;
		return Objects.equals(typeOfPodcast, other.typeOfPodcast);
	}

	@Override
	public String toString() {
		return "Podcast [typeOfPodcast=" + typeOfPodcast + "]";
	}

}
