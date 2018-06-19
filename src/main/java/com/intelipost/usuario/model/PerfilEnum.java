package com.intelipost.usuario.model;

import java.util.ArrayList;
import java.util.List;

public enum PerfilEnum {
	FREE("Participar do fórum"), 
	BASIC("Participar do fórum", "Baixar revistas"), 
	PREMIUM("Participar do fórum", "Baixar revistas", "Assistir vídeo aulas");
	
	private List<String> activities = new ArrayList<>();
	
	public List<String> getActivities() {
		return activities;
	}
	
	private PerfilEnum(String... activities) {
		for (String activityElement : activities) {
			this.activities.add(activityElement);
		}
	}
}
