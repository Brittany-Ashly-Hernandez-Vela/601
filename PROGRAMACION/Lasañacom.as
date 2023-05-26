package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	
	public class Lasañacom extends MovieClip{
		private var vel: Number=5;

		public function Lasañacom(posX, posY) {
			// constructor code
			x = posX + 40;
			y = posY + 40;
			scaleX= .8;
			scaleY= .8;
			
			this.addEventListener(Event.ENTER_FRAME, mover);
		}
import flash.events.Event;

		  public function mover(e: Event){
			  y+= vel;
			  if(y>=175){
				  
				  vel=0;
				  this.removeEventListener(Event.ENTER_FRAME, mover);
				  stage.removeChild(this);
			  }
			  if(this.hitTestObject(setup.Garfield_new.punto_colision)){
				 //trace("Colsion");
				 this.removeEventListener(Event.ENTER_FRAME, mover);
				  stage.removeChild(this);
				 }
		  }

	}
	
}
