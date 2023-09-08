package com.itacademy.java_classes.interface_1;

public class Main {

	public static void main(String[] args) {
		
		Reproducible video = new Video("Eat,pray,love", "MP4", 124, "HD");
		video.pause();
		video.play();
		video.rewind();
		video.stop();
		System.out.println();
		
		Reproducible mp3 = new MP3("Love song", "MP3", 3, 128);
		mp3.play();
		mp3.pause();
		mp3.rewind();
		mp3.stop();
		System.out.println();
		
		Reproducible podcast = new Podcast("About music", "Wav", 54, "Artistic");
		podcast.play();
		podcast.pause();
		podcast.rewind();
		podcast.stop();
		
	}

}
