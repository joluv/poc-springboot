package fr.jansem.poc.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.jansem.poc.springboot.model.domain.calculette.SimulationResultats;
import fr.jansem.poc.springboot.web.service.SimulationService;

/**
 * Controller de gestion de la page de simulation
 * 
 * @author rjansem
 *
 */
@Controller
public class SimulationController {

	private static final String SIMULATION_VIEW = "simulation/simulateur";

	@Autowired
	private SimulationService simulationService;

	@RequestMapping("/simulation")
	public ModelAndView display() {

		ModelAndView mav = new ModelAndView(SIMULATION_VIEW);
		List<SimulationResultats> simulations = simulationService.getSimulationsByCaisseAndProduit("1", "1");
		mav.addObject("simulations", simulations);
		return mav;
	}
}
