package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	
	public class setup extends MovieClip {
		
		private var Fondo_new: Fondo = new Fondo;
		private var Suelo_new: Suelo = new Suelo;
		static var Garfield_new: Garfield = new Garfield;
		private var Odiecompl_new: Odiecompl = new Odiecompl;
		static var puntos_box_new: puntos_box = new puntos_box();
		static var puntos: Number =0;
		
		 public function setup() {
			// constructor code
			
			addChild(Fondo_new);
			addChild(Suelo_new);
			addChild(Garfield_new);
			addChild(Odiecompl_new);
			addChild(puntos_box_new);
			
			
			Fondo_new.x=-27,Fondo_new.y=0;
			Suelo_new.x=40, Suelo_new.y=301;
			Garfield_new.x=0, Garfield_new.y=150;
			Odiecompl_new.x=0, Odiecompl_new.y=-100;
			puntos_box_new.x=395, puntos_box_new.y=375;
			puntos_box_new.puntos_txt.text = String(puntos);
			
		}

	}
	
}
