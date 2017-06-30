package controlador;

import modelo.HistoriaClinica;
import modelo.Paciente;

public class LogicaHistorias {
	
	public Paciente buscarPaciente( String nombre ){
		
		/**
		 * Creo el objeto para acceder a la base de datos
		 */
		Paciente basededatos = new Paciente(true);
		/**
		 * Obtengo todos los pacientes registrados en la base de datos
		 */
		Paciente[] todoslospacientes = basededatos.getPacientes();
		/**
		 * Creo un objteto vacio de la clase Paciente, que contendra el paciente encontrado segun su nombre
		 */
		Paciente pacienteEncontrado = null;
		
		
		/**
		 * Recorro el arreglo que contiene todos los pacientes
		 * a traves de la sentencia FOR
		 */
		for (int i = 0; i < todoslospacientes.length; i++) {
			
			/**
			 * Si el nombre ingresado por paramtetro es "igual" al nombre del paciente en la posicion i
			 * entonces a pacienteEncontrado le asigno el objeto que se encuentre en la poscion i
			 */
			if ( nombre.equalsIgnoreCase( todoslospacientes[ i ].getNombre() ) ) {

				pacienteEncontrado = todoslospacientes[ i ];
			}
		}
		
		return pacienteEncontrado;
		
	}
	
	public Paciente buscarPaciente( int dni ){
		
		/**
		 * Creo el objeto para acceder a la base de datos
		 */
		Paciente basededatos = new Paciente(true);
		/**
		 * Obtengo todos los pacientes registrados en la base de datos
		 */
		Paciente[] todoslospacientes = basededatos.getPacientes();
		/**
		 * Creo un objteto vacio de la clase Paciente, que contendra el paciente encontrado segun su nombre
		 */
		Paciente pacienteEncontrado = null;
		
		
		/**
		 * Recorro el arreglo que contiene todos los pacientes
		 * a traves de la sentencia FOR
		 */
		for (int i = 0; i < todoslospacientes.length; i++) {
			
			/**
			 * Si el DNI ingresado por paramtetro es "igual" al DNI del paciente en la posicion i
			 * entonces a pacienteEncontrado le asigno el objeto que se encuentre en la poscion i
			 */
			if ( dni == todoslospacientes[ i ].getDni() ) {

				pacienteEncontrado = todoslospacientes[ i ];
			}
		}
		
		return pacienteEncontrado;
		
	}
	
	public int verTotalHistorias(){
		
		HistoriaClinica basededatos = new HistoriaClinica(true);
		HistoriaClinica[] todaslashitorias = basededatos.getHistorias();
		int cantidadDeHistorias = todaslashitorias.length;
		
		return cantidadDeHistorias;
		
	}
	
	public HistoriaClinica buscarHistoriaClinica( String nombre ){
		
		Paciente pacienteEncontrado = buscarPaciente( nombre );
		HistoriaClinica basededatos = new HistoriaClinica(true);
		HistoriaClinica[] todaslashitorias = basededatos.getHistorias();
		HistoriaClinica historiaEncontrada = null;
		
		if( pacienteEncontrado!= null ) {
			
			for (int i = 0; i < todaslashitorias.length; i++) {
				if( pacienteEncontrado.getNombre().equalsIgnoreCase( todaslashitorias[ i ].getPaciente().getNombre() )  )
					historiaEncontrada = todaslashitorias[ i ];
			}	
		}
		
		return historiaEncontrada;
	}
public HistoriaClinica buscarHistoriaClinica( int dni ){
		
		Paciente pacienteEncontrado = buscarPaciente( dni );
		HistoriaClinica basededatos = new HistoriaClinica(true);
		HistoriaClinica[] todaslashitorias = basededatos.getHistorias();
		HistoriaClinica historiaEncontrada = null;
		
		if( pacienteEncontrado!= null ) {
			
			for (int i = 0; i < todaslashitorias.length; i++) {
				if( pacienteEncontrado.getNombre().equalsIgnoreCase( todaslashitorias[ i ].getPaciente().getNombre() )  )
					historiaEncontrada = todaslashitorias[ i ];
			}	
		}
		
		return historiaEncontrada;
	}

}