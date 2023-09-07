package com.itacademy.java_classes.interface_1;

import java.util.Objects;

public class Video implements Reproducible{
	
	private String videoName;
	
	public Video() {}
	
	public Video(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	@Override
	public void play() {
		System.out.println("Start video playback");
		
	}

	@Override
	public void pause() {
		System.out.println("Pause video playback");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop video playback");
		
	}

	@Override
	public void rewind() {
		System.out.println("Rewind video");
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(videoName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Video other = (Video) obj;
		return Objects.equals(videoName, other.videoName);
	}

	@Override
	public String toString() {
		return "Video [videoName=" + videoName + "]";
	}
	
	
	

}
