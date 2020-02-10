package Tv;

public class TV {

	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel,int volume,boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	
	public int getChannel() {
		return this.channel;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public boolean isPower() {
		return this.power;
	}
	
	
	public void power(boolean on)
	{
		//true on false off
		if(on)
			power=true;
		else
			power=false;
		
	}
	
	public void channel(int cnt) {
		
		if(cnt<1)
			channel=255;
		else if(cnt>255)
			channel=1;
		else
			channel=cnt;
	}
	
	public void channel(boolean up)
	{
		//true up false down
		
		if(up)
		{
			if(channel==255)
				channel=1;
			else
				channel++;
		}
		else
		{
			if(channel==1)
				channel=255;
			else 
				channel--;
		}
	}
	
	public void volume(int cnt)
	{
		if(cnt<1)
			volume=255;
		else if(cnt>255)
			volume=1;
		else
			volume=cnt;
		
	}
	
	public void volume(boolean up)
	{
		if(up)
		{
			if(volume==255)
				volume=1;
			else
				volume++;
		}
		else
		{
			if(channel==0)
				volume=255;
			else
				volume--;
				
		}
	}
	
	public void status() {
		System.out.println("TV Channel=" + channel+" volume="+volume+ " power="+power);
	}
}
