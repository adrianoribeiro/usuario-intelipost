package com.intelipost.usuario.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.intelipost.usuario.model.PerfilEnum;
import com.intelipost.usuario.model.User;

@Repository
public class UserRepository {

	public User getUserByName(String name) {
		List<User> usersReturned = users.stream()
				.filter(user -> name.equals(user.getNome()))
				.collect(Collectors.toList());
		return usersReturned.get(0);
	}
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1l, "Adriano", PerfilEnum.PREMIUM, LocalDate.of(1982, 7, 10)));
		users.add(new User(2l, "Berenice", PerfilEnum.FREE, LocalDate.of(1992, 9, 20)));
		users.add(new User(3l, "Carlota", PerfilEnum.BASIC, LocalDate.of(1990, 10, 12)));
		users.add(new User(4l, "Damiana", PerfilEnum.BASIC, LocalDate.of(1988, 4, 16)));
		users.add(new User(5l, "Epaminondas", PerfilEnum.BASIC, LocalDate.of(1966, 6, 19)));
	}
}
