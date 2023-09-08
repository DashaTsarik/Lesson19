package com.itacademy.java_classes.interface_1;

import java.util.Objects;

public class Video extends MediaFile{
	
	private String videoFormat;
	
	public Video() {
		super();
	}
	
	public Video(String name, String fileExpansion, int timeOfReproducingInMinutes, String videoFormat) {
		super(name, fileExpansion, timeOfReproducingInMinutes);
		this.videoFormat = videoFormat;
	}
	
	public String getVideoFormat() {
		return videoFormat;
	}

	public void setVideoFormat(String videoFormat) {
		this.videoFormat = videoFormat;
	}
	
	public boolean isMovie() {
		if (getTimeOfReproducingInMinutes() > 30) {
			return true;
		}
		return false;
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
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(videoFormat);
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
		Video other = (Video) obj;
		return Objects.equals(videoFormat, other.videoFormat);
	}

	@Override
	public String toString() {
		return "Video [videoFormat=" + videoFormat + "]";
	}

}
