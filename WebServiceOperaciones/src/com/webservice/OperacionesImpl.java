package com.webservice;

import javax.jws.WebService;

@WebService(endpointInterface="com.webservice.IOperaciones")
public class OperacionesImpl implements IOperaciones {

	@Override
	public int resta(int x, int y) {
		int z = x - y;
		return z;
	}

	@Override
	public int suma(int x, int y) {
		int z = x + y;
		return z;
	}

	@Override
	public int multiplica(int x, int y) {
		int z = x * y;
		return z;
	}

	@Override
	public int divide(int x, int y) {
		int z = x / y;
		return z;
	}

}
