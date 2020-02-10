package chapter03;




public class SongApp {

	public static void main(String[] args) {
		Song song = new Song();
		
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("real");
		song.setComposer("이민수");
		song.setTrack(3);
		song.setYear(2010);
		
		song.show();
		
		
		Song song2=new Song("Bluming","아이유",null,null,0,2019);
		
		song2.show();
		
	}
	
	public static void globalTest() {
		System.out.println(Global.globalVar);
		Global.globalFunc();
	}

}
