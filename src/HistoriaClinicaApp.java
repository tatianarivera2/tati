import controlador.LogicaHistorias;
import modelo.HistoriaClinica;
import modelo.Paciente;
import vista.Pantalla;

public class HistoriaClinicaApp {
	
	public static void main(String[] args) {
		
		Pantalla vista = new Pantalla();
		LogicaHistorias controlador = new LogicaHistorias();		
		
		String nombrePaciente = vista.ingresarValor( "Buscar Paciente por Nombre" );
		Paciente encontrado = controlador.buscarPaciente( nombrePaciente );
				
		if( encontrado != null ){
			vista.mostrarMensaje( "Paciente : " + encontrado.getNombre() + " DNI : " + encontrado.getDni() );
			
			vista.mostrarMensaje( "Total Historias : " + controlador.verTotalHistorias() );
			
			HistoriaClinica historia = controlador.buscarHistoriaClinica(nombrePaciente);
						
			vista.mostrarMensaje( historia.getFecha() + "  " + historia.getDiagnostico() );
		} else {
			vista.mostrarMensaje( "No existe este paciente en la BD" );
		}
		
		String dniPaciente = vista.ingresarValor( "Buscar Paciente por DNI" );
		Paciente dniencontrado = controlador.buscarPaciente(Integer.parseInt(dniPaciente));
		
		if( dniencontrado != null ){
			vista.mostrarMensaje( "Paciente : " + dniencontrado.getNombre() + " DNI : " + dniencontrado.getDni() );
			
			vista.mostrarMensaje( "Total Historias : " + controlador.verTotalHistorias() );
			
			HistoriaClinica historia = controlador.buscarHistoriaClinica(dniencontrado.getDni());
						
			vista.mostrarMensaje( historia.getFecha() + "  " + historia.getDiagnostico() );
		} else {
			vista.mostrarMensaje( "No existe este paciente en la BD" );
		}
		
	}

}
