package com.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IOperaciones {
	
	@WebMethod(operationName="resta", action="urn:Resta")
	public int resta(@WebParam(name = "valorNumerico1") int x, @WebParam(name = "valorNumerico2") int y);
	
	@WebMethod(operationName="suma", action="urn:Suma")
	public int suma(@WebParam(name = "valorNumerico1") int x, @WebParam(name = "valorNumerico2") int y);
	
	@WebMethod(operationName="multiplica", action="urn:Multiplica")
	public int multiplica(@WebParam(name = "valorNumerico1") int x, @WebParam(name = "valorNumerico2") int y);
	
	@WebMethod(operationName="divide", action="urn:Divide")
	public int divide(@WebParam(name = "valorNumerico1") int x, @WebParam(name = "valorNumerico2") int y);
}
