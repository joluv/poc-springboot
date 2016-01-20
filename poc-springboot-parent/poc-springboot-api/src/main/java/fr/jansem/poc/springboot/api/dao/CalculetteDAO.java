package fr.jansem.poc.springboot.api.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Repository;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import fr.jansem.poc.springboot.api.dao.calculette.bean.CallSmk000;
import fr.jansem.poc.springboot.api.dao.calculette.bean.CallSmk000Response;
import fr.jansem.poc.springboot.api.dao.calculette.bean.LcsDasspDto;
import fr.jansem.poc.springboot.api.dao.calculette.bean.LcsDpalamnnDto;
import fr.jansem.poc.springboot.api.dao.calculette.bean.LcsSmk000DataInDto;
import fr.jansem.poc.springboot.api.dao.calculette.bean.LcsSmk000DataOutDto;
import fr.jansem.poc.springboot.api.dao.calculette.bean.LcsSmk000ResultDto;
import fr.jansem.poc.springboot.api.dao.calculette.bean.LcsTABDto;
import fr.jansem.poc.springboot.api.dao.calculette.bean.LcsTAPaliersDto;
import fr.jansem.poc.springboot.api.dao.calculette.bean.ServiceSessionDto;
import fr.jansem.poc.springboot.model.domain.calculette.SimulationRequest;
import fr.jansem.poc.springboot.model.domain.calculette.SimulationResultats;

/**
 * DAO permettant l'appel au WS SOAP Calculette LO
 * 
 * @author rjansem
 *
 */
@Repository
public class CalculetteDAO extends WebServiceGatewaySupport {

	@Value("${env.calculetteLoWs.uri}")
	private String wsUri;

	@Value("${env.calculetteLoWs.targetNameSpace}")
	private String targetNameSpace;

	@Value("${env.calculetteLoWs.params.applicationId}")
	private String applicationId;

	@Value("${env.calculetteLoWs.params.companyId}")
	private String companyId;

	@Value("${env.calculetteLoWs.params.language}")
	private String language;

	@Value("${env.calculetteLoWs.params.userEmail}")
	private String userEmail;

	@Value("${env.calculetteLoWs.params.userFirstname}")
	private String userFirstname;

	@Value("${env.calculetteLoWs.params.userId}")
	private String userId;

	@Value("${env.calculetteLoWs.params.userLastname}")
	private String userLastname;

	@Value("${env.calculetteLoWs.params.cdfonc}")
	private String cdfonc;

	@Value("${env.calculetteLoWs.params.inedta}")
	private String inedta;

	@Value("${env.calculetteLoWs.params.mdcalteg_12}")
	private String mdcalteg_12;

	@Value("${env.calculetteLoWs.params.mdcaltaea_12}")
	private String mdcaltaea_12;

	@Value("${env.calculetteLoWs.params.cdbscal_20}")
	private String cdbscal_20;

	@Value("${env.calculetteLoWs.params.rfpalier_20}")
	private String rfpalier_20;

	@Value("${env.calculetteLoWs.params.inasstaea_20}")
	private String inasstaea_20;

	@Value("${env.calculetteLoWs.params.inassteg_20}")
	private String inassteg_20;

	@Value("${env.calculetteLoWs.params.peint_18}")
	private Integer peint_18;

	@Autowired
	@Qualifier("calculetteMarshaller")
	private Jaxb2Marshaller marshaller;

	private static final Logger LOGGER = LoggerFactory.getLogger(CalculetteDAO.class);

	@PostConstruct
	public void init() {
		this.setDefaultUri(targetNameSpace);
		this.setMarshaller(marshaller);
		this.setUnmarshaller(marshaller);
	}

	/**
	 * Appel du webService CalculetteLO pour effectuer une simulation
	 * 
	 * @param simulation
	 * @return
	 */
	public SimulationResultats executeSimulation(SimulationRequest simulation) {

		LOGGER.debug("Appel du webService de simulation");
		CallSmk000 request = new CallSmk000();
		ServiceSessionDto arg0 = new ServiceSessionDto();
		arg0.setApplicationId(applicationId);
		arg0.setCompanyId(companyId);
		arg0.setLanguage(language);

		GregorianCalendar gCalendar = new GregorianCalendar();
		gCalendar.setTime(new Date());
		XMLGregorianCalendar xmlCalendar = null;
		try {
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
		} catch (DatatypeConfigurationException e) {
			throw new RuntimeException("Erreur lors de la transformation de la date", e);
		}

		arg0.setTreatmentDate(xmlCalendar);
		arg0.setUserEmail(userEmail);
		arg0.setUserFirstname(userFirstname);
		arg0.setUserId(userId);
		arg0.setUserLastname(userLastname);

		request.setArg0(arg0);

		LcsSmk000DataInDto arg1 = new LcsSmk000DataInDto();
		arg1.setCdfonc(cdfonc);
		arg1.setInedta(inedta);
		arg1.setNominal12(simulation.getMontantPret().doubleValue());
		arg1.setDuree12(simulation.getDureePretMois());
		arg1.setMdcalteg12(mdcalteg_12);
		arg1.setMdcaltaea12(mdcaltaea_12);

		List<LcsDasspDto> listDassp = arg1.getDassp();
		LcsDasspDto dassp = new LcsDasspDto();
		dassp.setCdbscal20(cdbscal_20);
		dassp.setRfpalier20(rfpalier_20);
		dassp.setInasstaea20(inasstaea_20);
		dassp.setInassteg20(inassteg_20);
		dassp.setTxpercep20(simulation.getTauxAssurance().doubleValue());

		listDassp.add(dassp);

		List<LcsDpalamnnDto> listDpalamnn = arg1.getDpalamnn();
		LcsDpalamnnDto dpalamnn = new LcsDpalamnnDto();
		dpalamnn.setPeint18(peint_18);
		dpalamnn.setNbtermp18(simulation.getDureePretMois());
		dpalamnn.setTxint77(simulation.getTauxPret().doubleValue());
		listDpalamnn.add(dpalamnn);
		request.setArg1(arg1);

		@SuppressWarnings("unchecked")
		JAXBElement<CallSmk000Response> jaxbElement = (JAXBElement<CallSmk000Response>) getWebServiceTemplate()
				.marshalSendAndReceive(wsUri,
				request);

		CallSmk000Response response = jaxbElement.getValue();
		LOGGER.debug("Appel effectué");
		return buildResultats(simulation, response);
	}

	private SimulationResultats buildResultats(SimulationRequest simulation, CallSmk000Response response) {
		SimulationResultats resultats = new SimulationResultats();

		resultats.setMontantEnprunt(simulation.getMontantPret());
		resultats.setDureePretMois(simulation.getDureePretMois());
		resultats.setTauxDebiteurFixe(simulation.getTauxPret());
		resultats.setTauxNominalAssurance(simulation.getTauxAssurance());

		LcsSmk000ResultDto result = response.getReturn();

		LcsSmk000DataOutDto lcsSmk000DataOutDto = result.getLcsSmk000DataOutDto();
		LcsTABDto lcsTABDto = lcsSmk000DataOutDto.getLcsTABDto();
		List<LcsTAPaliersDto> paliers = lcsTABDto.getPaliers();

		LcsTAPaliersDto palier = paliers.get(0);

		resultats.setMensualiteHorsAssurance(new BigDecimal(palier.getMtki()));
		resultats.setTaegFixe(new BigDecimal(lcsSmk000DataOutDto.getTeg()));
		resultats.setMontantTotalInterets(new BigDecimal(lcsTABDto.getTotintc()));
		resultats
				.setMontantTotalDuHorsAssurance(resultats.getMontantEnprunt().add(resultats.getMontantTotalInterets()));
		resultats.setMensualiteAssurance(new BigDecimal(palier.getMtass()));
		resultats.setCoutTotalAssurance(new BigDecimal(lcsTABDto.getTotassc()));
		resultats.setTaea(new BigDecimal(lcsSmk000DataOutDto.getTaea()));
		return resultats;

	}

}
