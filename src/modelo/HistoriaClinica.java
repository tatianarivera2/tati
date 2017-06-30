package modelo;

public class HistoriaClinica {
	
	HistoriaClinica[] historias = new HistoriaClinica[ 3 ];
	
	public HistoriaClinica() {
		// TODO Auto-generated constructor stub
	}
	
	public HistoriaClinica( boolean llenarBD ){
		if (llenarBD) {
			crearHistorias();
		}
	}
	
	private void crearHistorias(){
		
		Paciente bdPaciente = new Paciente( true );
		Medico bdMedico = new Medico( true );
		
		Paciente[] todosLosPacientes = bdPaciente.getPacientes(); 
		Medico[] todosLosMedicos = bdMedico.getMedicos();
		
		HistoriaClinica uno = new HistoriaClinica();
		uno.setNumero( 1 );
		uno.setFecha( "23/09/2016" );
		uno.setPaciente( todosLosPacientes[0] );
		uno.setDiagnostico( "Sirrosis" );
		uno.setMedico( todosLosMedicos[1] );
		uno.setTratamiento( "Ejercicios" );
		historias[ 0 ] = uno;
		
		HistoriaClinica dos = new HistoriaClinica();
		dos.setNumero( 2 );
		dos.setFecha( "01/01/2017" );
		dos.setPaciente( todosLosPacientes[1] );
		dos.setDiagnostico( "Sirrosis" );
		dos.setMedico( todosLosMedicos[0] );
		dos.setTratamiento( "Operacion" );
		historias[ 1 ] = dos;

		
		HistoriaClinica tres = new HistoriaClinica();
		tres.setNumero( 3 );
		tres.setFecha( "16/04/2017" );
		tres.setPaciente( todosLosPacientes[2] );
		tres.setDiagnostico( "Dolor de Cabeza" );
		tres.setMedico( todosLosMedicos[1] );
		tres.setTratamiento( "Ejercicios" );
		historias[ 2 ] = tres;
		
	}
	
	private int numero;
	private String fecha;
	private Paciente paciente;
	private String diagnostico;
	private Medico medico;
	private String tratamiento;

	public HistoriaClinica[] getHistorias() {
		return historias;
	}
	public void setHistorias(HistoriaClinica[] historias) {
		this.historias = historias;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

}
