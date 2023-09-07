package com.itacademy.java_classes.interface_1;

import java.util.Objects;

public class Podcast implements Reproducible{
	
	private String podcastName;
	
	public Podcast() {}
	
	public Podcast(String podcastName) {
		this.podcastName = podcastName;
	}

	public String getPodcastName() {
		return podcastName;
	}

	public void setPodcastName(String podcastName) {
		this.podcastName = podcastName;
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
		return Objects.hash(podcastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Podcast other = (Podcast) obj;
		return Objects.equals(podcastName, other.podcastName);
	}

	@Override
	public String toString() {
		return "Podcast [podcastName=" + podcastName + "]";
	}
	
	
	
	
	
	

}
