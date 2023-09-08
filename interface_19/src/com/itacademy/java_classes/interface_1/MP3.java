package com.itacademy.java_classes.interface_1;

import java.util.Objects;

public class MP3 extends MediaFile{
	
	private int bitrate;
	
	public MP3() {
		super();
	}
	
	public MP3(String name, String fileExpansion, int timeOfReproducingInMinutes, int bitrate ) {
		super(name, fileExpansion, timeOfReproducingInMinutes);
		this.bitrate = bitrate;
	}

	public int getBitrate() {
		return bitrate;
	}

	public void setBitrate(int bitrate) {
		this.bitrate = bitrate;
	}

	@Override
	public void play() {
		System.out.println("Start playback on MP3 Player");
		
	}

	@Override
	public void pause() {
		System.out.println("Pause playback on MP3 Player");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop playback on MP3 Player");
		
	}

	@Override
	public void rewind() {
		System.out.println("Rewind MP3");
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bitrate);
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
		MP3 other = (MP3) obj;
		return bitrate == other.bitrate;
	}

	@Override
	public String toString() {
		return "MP3 [bitrate=" + bitrate + "]";
	}
	
}
