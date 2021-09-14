import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KrishMalik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KrishMalik extends Student
{
    /**
     * Act - do whatever the KrishMalik wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public KrishMalik(String f,String l, int r, int s){
        firstName = f;
        lastName= l;
        mySeatX=r;
        mySeatY=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";
        setImage(portraitFile);
    }
    public KrishMalik(){
        firstName="Krish";
        lastName = "Malik";
        mySeatX=0;
        mySeatY=0;
        portraitFile=firstName.toLowerCase()+lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        setImage(portraitFile);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            getName();
            sayName(soundFile);
            circleClass();
            myHobby("I like ,to play basketball");
        }
    }
     public void circleClass(){;
        Greenfoot.delay(10);
        setRotation(90);
        Greenfoot.delay(20);
        for (int i=5;i>=0;i--){
            setLocation(0,i);
            Greenfoot.delay(10);
        }
        setRotation(180);
         for (int i=1;i<=2;i++){
            setLocation(i,0);
            Greenfoot.delay(10);
        }
        for (int i=2;i>=0;i--){
            setLocation(i,2);
            Greenfoot.delay(5);
        }   
    }
  
    
     /**
     * myHobby is one of the interfaces provided.  
     * An interface is just a contract for the methods that you will implement in your code.  The College Board no longer
     * tests on abstract classes and interfaces, but it is good to know about them
     */
     public void myHobby(String s) {
         System.out.println(s);
}

    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    

}
