package HitzJuilan;
import robocode.*;


public class Try2WinBot extends JuniorRobot
{
    //When the opponent is close
    public void MeleeMode(){
	if(scannedDistance > 15)
        {    
    	back(60);
		}
    }
	
	public void run() 
    { 
    	setColors(orange, white, white, orange, orange);

		while(true) //The gun 45 degrees for all around damage
           {
		   ahead(100);
		   turnGunRight(45);
		   }
    }
    public void onScannedRobot()
       {
		fire(3);
       }
	public void onHitWall() 
       {
        turnRight(90);
	   }
	
    public void onHitByBullet()//Dodge to avoid getting hit multiple times
       {
        turnRight(45);
       }	
	

}
