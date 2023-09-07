package com.itacademy.java_classes.interface_1;

import java.util.Objects;

public class MP3 implements Reproducible{
	
	private String mp3Name;
	
	public MP3() {}
	
	public MP3(String mp3Name) {
		this.mp3Name = mp3Name;
	}

	public String getMp3Name() {
		return mp3Name;
	}

	public void setMp3Name(String mp3Name) {
		this.mp3Name = mp3Name;
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
		return Objects.hash(mp3Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MP3 other = (MP3) obj;
		return Objects.equals(mp3Name, other.mp3Name);
	}

	@Override
	public String toString() {
		return "MP3 [mp3Name=" + mp3Name + "]";
	}
	
	

}
