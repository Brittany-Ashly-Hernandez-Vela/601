package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.events.KeyboardEvent;
	import flash.utils.Timer;
	import flash.events.TimerEvent;
	
	public class Odiecompl extends MovieClip{
		
		private var vel : Number= 5;
		private var dir : Number= 1;
		private var limite_der= 225;
		private var limite_izq= -215;
		private var t_cambia: Timer = new Timer(200, 0);
		private var dado: Number;
		
		private var t_Lanzar: Timer = new Timer(2000, 0);

		public function Odiecompl() {
			// constructor code
			addEventListener(Event.ENTER_FRAME, actualiza);
			t_cambia.addEventListener(TimerEvent.TIMER, cambia_dir);
			t_cambia.start();
			
			t_Lanzar.addEventListener(TimerEvent.TIMER, Lanza_Lasañacom);
			t_Lanzar.start();  
			
		}
		     public function Lanza_Lasañacom(e: TimerEvent){
				 //trace("Lasaña Lanzada");
				 var Lasañacom_new = new Lasañacom(x,y);
				 stage.addChild(Lasañacom_new);
			 }
		
             public function actualiza(e: Event){
				 x += vel * dir;
				 if(x >= limite_der){
					 dir= -1;
				 }
				 if(x <= limite_izq){
					 dir= 1;
				 }
			 }

     public function cambia_dir(e: TimerEvent){
		    dado = Math.floor(Math.random() * 8);
	        switch(dado){
				case 1:
				dir=1;
				break;
				case 2:
				dir = -1;
				break;
				
				
			}
			}
			
	}
	
}
