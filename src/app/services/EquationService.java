package app.services;

import java.util.Optional;

import app.model.Equation;

public class EquationService {
	
	public Optional<Equation> getResult(Equation e){
		switch (e.getType()) {
		case "adicao":
			e.addition(e.getValue1(),e.getValeu2());
			return Optional.of(e);
		case "subtracao":
			e.subtraction(e.getValue1(),e.getValeu2());
			return Optional.of(e);
		case "multiplicacao":
			e.multiplication(e.getValue1(),e.getValeu2());
			return Optional.of(e);
		case "divisao":
			e.division(e.getValue1(),e.getValeu2());
			return Optional.of(e);
		default:
			return Optional.empty();
		}
		
	}
}
