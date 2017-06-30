package modelo;

public class Medico extends Persona{
	
	Medico[] medicos = new Medico[2];
	
	public int matricula;
	public String especialidad;
	
	public Medico(){
		System.out.println( "Se crea el objeto medico" );
	}
	
	public Medico( boolean llenarBD ){
		if (llenarBD) {
			crearMedico();	
		}
	}
	
	private void crearMedico(){
		
		Medico alexis = new Medico();
		alexis.setNombre( "Alexis Molina" );
		alexis.setMatricula( 1234 );
		alexis.setEspecialidad( "Cirujano" );
		medicos[ 0 ] = alexis;
		
		Medico tatiana = new Medico();
		tatiana.setNombre( "Tatiana Rivera" );
		tatiana.setMatricula( 4321 );
		tatiana.setEspecialidad( "Fisioterapeuta" );
		medicos[ 1 ] = tatiana;
		
	}
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Medico[] getMedicos() {
		return medicos;
	}

}
