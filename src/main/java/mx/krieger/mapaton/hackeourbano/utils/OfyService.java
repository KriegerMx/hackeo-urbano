/**
 * 23 Jul 2015 - 17:08:01
 */
package mx.krieger.mapaton.hackeourbano.utils;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import mx.krieger.mapaton.hackeourbano.model.entities.Questionnaire;
import mx.krieger.mapaton.hackeourbano.model.wrappers.RouteStats;

/**
 * This class is used to manage entity classes within objectify and Google Data
 * Storage.
 * 
 * @author JJMS (juanjo@krieger.mx)
 * @since 19 Aug 2015 - 00:54:58
 * @version 1.0.0.0
 */
public class OfyService extends mx.krieger.mapaton.publicutils.utils.OfyService{
	static {
		factory().register(Questionnaire.class);
		factory().register(RouteStats.class);
	}

	public static Objectify ofy() {
		return ObjectifyService.ofy();
	}

	public static ObjectifyFactory factory() {
		return ObjectifyService.factory();
	}

}
