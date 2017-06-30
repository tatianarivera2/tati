package modelo;

public class Paciente extends Persona{
	
	Paciente[] pacientes = new Paciente[ 3 ];
	
	public String grupoanguineo;
	
	public Paciente(){
		System.out.println( "Se crea el objeto Paciente" );
	}
	
	public Paciente( boolean llenarBD ){
		
		if( llenarBD )
			crearPacientes();
		
	}
	
	private void crearPacientes(){
		
		Paciente servando = new Paciente();
		servando.setNombre( "Servando Reyes" );
		servando.setDni(95698933);
		servando.setEdad( 28 );
		servando.setGrupoanguineo("O+");
		pacientes[ 0 ] = servando;
		
		Paciente marina = new Paciente();
		marina.setNombre( "Marina Villaggi" );
		marina.setDni(23893743);
		marina.setEdad(36);
		marina.setGrupoanguineo( "A+" );
		pacientes[ 1 ] = marina;
		
		Paciente douglas = new Paciente();
		douglas.setNombre( "Douglas Carrion" );
		douglas.setDni(94536121);
		douglas.setEdad( 22 );
		douglas.setGrupoanguineo( "ORH-" );
		pacientes[ 2 ] = douglas;
		
	}

	public String getGrupoanguineo() {
		return grupoanguineo;
	}

	public void setGrupoanguineo(String grupoanguineo) {
		this.grupoanguineo = grupoanguineo;
	}

	public Paciente[] getPacientes() {
		return pacientes;
	}

}