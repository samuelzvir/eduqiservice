package org.eduqi.eduqiservice.core.service;

import javax.sql.DataSource;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eduqi.eduqiservice.core.exception.TypeaheadStartException;
import org.springframework.beans.factory.annotation.Autowired;


public class EduqiInitServices {

	private static final Logger LOG = Logger.getLogger(EduqiInitServices.class);
	
	@Autowired
	private EduqiTypeaheadService typeaheadService;
	
	@Autowired
	private DataSource dataSource;
	
	public EduqiInitServices(EduqiTypeaheadService typeaheadService, DataSource dataSource) {
		super();
		this.typeaheadService = typeaheadService;
		this.dataSource =  dataSource;
	}
	public EduqiInitServices(){}

	public void startAll() throws TypeaheadStartException{
		LOG.log(Level.INFO, "starting services");
		try {
			dataSource.getConnection();
			
			typeaheadService.startTypeAhead();
		} catch (Exception e) {
			LOG.log(Level.ERROR, "Error starting Typeahead");
			throw new TypeaheadStartException("Impossible to start typeahead!",e.getCause());
		}	
	}
}
