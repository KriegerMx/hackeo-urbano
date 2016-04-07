package mx.krieger.mapaton.hackeourbano.apis;

import com.google.api.server.spi.config.*;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import mx.krieger.labplc.mapaton.commons.exceptions.TrailNotFoundException;
import mx.krieger.mapaton.hackeourbano.handlers.QuestionnaireHandler;
import mx.krieger.mapaton.hackeourbano.model.wrappers.QuestionnaireWrapper;
import mx.krieger.mapaton.hackeourbano.model.wrappers.RouteStatsParameter;
import mx.krieger.mapaton.hackeourbano.model.wrappers.RouteStatsResponse;
import mx.krieger.mapaton.publicutils.wrappers.RouteStatsWrapper;


@Api(
		name = "hackeoUrbanoAPI",
		canonicalName = "hackeoUrbanoAPI",
		title = "API fopr Hackeo Urbano",
		description = "This is the API used by Hackeo Urbano",
		authLevel = AuthLevel.NONE,
		namespace = @ApiNamespace(
				ownerDomain = "mapaton.krieger.mx",
				ownerName = "krieger",
				packagePath = "clients") )
public class HackeoUrbanoAPI {
	
	@ApiMethod(path = "registerQuestionnaire", name = "registerQuestionnaire", httpMethod = HttpMethod.POST)
	public void registerQuestionnaire(QuestionnaireWrapper parameter) throws TrailNotFoundException{
		new QuestionnaireHandler().register(parameter);

	}
	@ApiMethod(path = "getQuestionnaire", name = "getQuestionnaire", httpMethod = HttpMethod.POST)
	public QuestionnaireWrapper getQuestionnaire(@Named("id") Long id){
		return new QuestionnaireHandler().get(id);

	}
	@ApiMethod(path = "getStats", name = "getStats", httpMethod = HttpMethod.POST)
	public RouteStatsWrapper getStats(@Named("trailId") Long trailId){
		return new QuestionnaireHandler().getStats(trailId);

	}
	
	@ApiMethod(path = "getAllStats", name = "getAllStats", httpMethod = HttpMethod.POST)
	public RouteStatsResponse getAllStats(RouteStatsParameter parameter){
		return new QuestionnaireHandler().getAllStats(parameter);
	}
}
