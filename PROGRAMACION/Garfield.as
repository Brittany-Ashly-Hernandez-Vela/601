
package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.events.KeyboardEvent;
	
	public class Garfield extends MovieClip {
           
		 private var der: Boolean = false;
		 private var izq: Boolean = false;
		 private var vel: int=10;
		 
		   

		public function Garfield() {
			// constructor code
			addEventListener (Event.ENTER_FRAME, motor);
			
			
			
		}
		
		public function  motor(e: Event): void {
			if (der && x<215){
				
				x+= 10;
			}
			
			
			if  (x<-225){
			
			}
			
			
			else if(izq){
					x-=10;
				}
				controles();
			}
			public function controles(){
				stage.addEventListener(KeyboardEvent.KEY_DOWN, keydown);
				stage.addEventListener(KeyboardEvent.KEY_UP, keyup);
				
			}
			
		   public function keydown(e: KeyboardEvent): void {
			   switch(e.keyCode){
				   case 39:
				   der = true;
				   break;
				   case 37:
				   izq = true;
				   break;
				 
			   }
		   }
		    public function keyup(e: KeyboardEvent): void {
			   switch(e.keyCode){
				   case 39:
				   der = false;
				   break;
				   case 37:
				   izq = false;
				   break;
				 
			   }
		   }
}
}
	