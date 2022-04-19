package me.alexfrocha;

public class Tarefas {
	
	private String tarefa;
	private long id;
	
	public Tarefas(String tarefa) {
		this.tarefa = tarefa;
	}
	
	public long getId() {
		return id;
	}
	
	public String getTarefa() {
		return tarefa;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
	
	@Override
	public String toString() {
		return "[Tarefa: \"" + this.tarefa + "\" - [" + this.id +"]]";
	}
}
