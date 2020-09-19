package smbenga_Lab4;


/**
 * The purpose of this class is to model a television 
 * 
 *Name: Stephane Mbenga Date:9/17/2020
 */

	public class Television 
	{
		//attributes
	    final private String MANUFACTURER;  //this attribute will hold the brand name
	    final private int SCREEN_SIZE; //this attribute will hold the screen size
	    private boolean powerOn; //determine whether a t.v object is on or off
	    private int channel; //will hold the current station of a t.v object
	    private int volume; //this attribute will hold the value of the sound
	    
	    
	    //methods,constructors
	    /**
	     * The purpose of the constructor is to initialize the attributes
	     * @param brandName
	     * @param screenSize
	     */
	    public Television(String brandName, int screenSize) 
	    {
	    	MANUFACTURER = brandName;
	    	SCREEN_SIZE = screenSize;
	    	powerOn = false;
	    	volume = 20;
	    	channel = 2;
	    }
	    
	    //accessor methods
	    /**
	     * @return the MANUFACTURER name
	     */
	    public String getManufacturer()
	    {
	    	return MANUFACTURER;
	    }
	    
	    /** 
	     * @return returns screen size
	     */
	    public int getScreenSize()
	    {
	    	return SCREEN_SIZE;
	    }
	    /**
	     * @return returns the current channel;
	     */
	    
	    public int getChannel()
	    {
	    	return channel;
	    }
	    
	    /** 
	     * sets the value of the volume
	     * @return the current volume value
	     */
	    public int getVolume()
	    {
	    	return volume;
	    }
	    
	    //mutator methods
	    /**
	     * sets the value for the channel
	     * @param channelNum, sets the channel number
	     */
	    public void setChannel(int channelNum)
	    {
	    	channel = channelNum;
	    }
	   
	    /**
	     * Changes the state of power of the T.V, if the tv is off this methods turns it on and vice versa
	     */
	    public void power() 
	    {
	    	powerOn = !powerOn;
	    }
	    
	    /**
	     * increases the volume of the T.V by 1
	     */
	    public void increaseVolume() 
	    {
	    	volume++;
	    }
	    
	    /**
	     * decreases the volume of T.V by 1
	     */
	    public void decreaseVolume()
	    {
	    	volume--;
	    }
	}
