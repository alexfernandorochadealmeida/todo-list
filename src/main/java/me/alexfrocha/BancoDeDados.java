package me.alexfrocha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BancoDeDados {
	private static long id = 1L;
	private static List<Tarefas> tarefas = new ArrayList<>();
	private static Map<Integer, String> tarefasMap = new HashMap<>();
	
	public void novaTarefa(Tarefas tarefa) {
		tarefas.add(tarefa);
		tarefasMap.put((int) id, tarefa.getTarefa());
		tarefa.setId(id);
		id++;
	}
	
	public void alterarTarefa(Integer id, String novaTarefa) {
		tarefasMap.put(id, novaTarefa);
		Iterator<Tarefas> it = tarefas.iterator();
		while(it.hasNext()) {
			Tarefas tarefa = it.next();
			if(tarefa.getId() == id) {
				tarefa.setTarefa(novaTarefa);
			}
		}
	}
	
	public static Map<Integer, String> getTarefasMap() {
		return tarefasMap;
	}
	
	public List<Tarefas> getTarefas() {
		return tarefas;
	}
}
