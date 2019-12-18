package app;

import controller.ControllerTelaPrincipal;
import view.FramePrincipal;


public class App {

	public static void main(String[] args) {
		
		FramePrincipal framePrincipal = new FramePrincipal();
		ControllerTelaPrincipal controllerTelaPrincipal = new ControllerTelaPrincipal(framePrincipal);
		
	}

}
