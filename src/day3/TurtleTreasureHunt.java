package day3;


	import java.awt.KeyEventDispatcher;

	import java.awt.KeyboardFocusManager;

	import java.awt.event.KeyEvent;

	import java.net.MalformedURLException;


	import javax.swing.JOptionPane;


	import org.teachingextensions.logo.ImageBackground;

	import org.teachingextensions.logo.Paintable;

	import org.teachingextensions.logo.Tortoise;


	/** Note: You will need the latest version of the TKP jar: http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar **/


	public class TurtleTreasureHunt implements KeyEventDispatcher {


	    int tortoiseSpeed = 5;


	    private void goUp() {

	        // 1. Make the tortoise move up the screen
	    	Tortoise.move(10);

	    }


	    private void goDown() {

	        // 2. make the tortoise move down the screen
	    	Tortoise.move(-10);

	    }


	    private void goLeft() {

	        // 3. make the tortoise move left (3 lines of code)
	    	Tortoise.turn(-90);
	        // Hint: the turn() method lags more than setAngle()


	    

	    

	    }


	    private void goRight() {

	        // 4. make the tortoise move right
	    	Tortoise.turn(90);
	    }


	    private void spaceBarWasPressed() {

	        int tortoiseLocationX = Tortoise.getX();

	        int tortoiseLocationY = Tortoise.getY();


	        // 5. Print out the variables for tortoiseLocationX and tortoiseLocationY
	        System.out.println( tortoiseLocationX );
	        System.out.println( tortoiseLocationY );

	        // 6. If tortoise is at same location as the fish,
	        if ( tortoiseLocationX < 131 && tortoiseLocationY < 71 ){
	        	JOptionPane.showMessageDialog(null, "Hi. I,m Bob. I love ChICHKEENnsS!!! CHCickchrens!!!!! I see a chiicCckenhenshcs Egg! Oh no! It's a turtle egg, not a CHHOIckheNesshnsChickekekeS egg!");
	        }
	        //             make a pop-up tell the Tortoise where to go next
	        if ( tortoiseLocationX < 220 && tortoiseLocationY > 380 && tortoiseLocationX > 150 && tortoiseLocationY < 430 ){
	        	JOptionPane.showMessageDialog(null, " It's making noises inside! It's going to hatch soon. Pacman: Hey over here.");
	        }
	        if ( tortoiseLocationX > 0 && tortoiseLocationY > 340 && tortoiseLocationX > 100 && tortoiseLocationY < 440 ){
	        	JOptionPane.showMessageDialog(null, " What are you doing near my pac? What an egg?! Where's my pac dot? Anyway the thing you're looking for is obviosly in the cave with rocks over there...");
	        }
	        if ( tortoiseLocationX > 450 && tortoiseLocationY > 220 && tortoiseLocationX > 540 && tortoiseLocationY < 280 ){
	        	JOptionPane.showMessageDialog(null, " A little tortoise peeks out of the hole. It's so far from home. It doesn't care.");
	        }
	        // 7. Give the user subsequent clues at different locations on the image

	        // (pirate robot, swamp, parrots, etc.)


	        

	    }


	    private void go() {

	        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);

	        /*

	         * If you want to use your own background, download the image you want, and change the following line to point to it like: new

	         * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");

	         */

	        Paintable backgroundImage = new ImageBackground("file:/Users/Gavin Morris/Downloads/turtlemap.jpg");

	        Tortoise.getBackgroundWindow().addPaintable(backgroundImage);

	        Tortoise.penUp();

	        JOptionPane.showMessageDialog(null, "Go ask the fish for help. Space to select.");

	    }


	    public boolean dispatchKeyEvent(KeyEvent e) {

	        if (e.getID() == KeyEvent.KEY_PRESSED) {

	            if (e.getKeyCode() == KeyEvent.VK_RIGHT)

	                goRight();

	            else if (e.getKeyCode() == KeyEvent.VK_LEFT)

	                goLeft();

	            else if (e.getKeyCode() == KeyEvent.VK_UP)

	                goUp();

	            else if (e.getKeyCode() == KeyEvent.VK_DOWN)

	                goDown();

	            else if (e.getKeyCode() == KeyEvent.VK_SPACE)

	                spaceBarWasPressed();

	        }

	        return false;

	    }


	    public static void main(String[] args) throws MalformedURLException {

	        new TurtleTreasureHunt().go();

	    }

	}



