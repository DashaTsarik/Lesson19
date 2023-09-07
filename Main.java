package com.itacademy.java_classes.interface_1;

public class Main {

	public static void main(String[] args) {
		
		Reproducible video = new Video("Eat,pray,love");
		video.pause();
		video.play();
		video.rewind();
		video.stop();
		
		Reproducible mp3 = new MP3("Love song");
		mp3.play();
		mp3.pause();
		mp3.rewind();
		mp3.stop();
		
		Reproducible podcast = new Podcast("About music");
		podcast.play();
		podcast.pause();
		podcast.rewind();
		podcast.stop();
		
		

	}

}
